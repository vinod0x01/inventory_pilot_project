/*Variables to store the page counts*/
let total_counts = 0;
let pages = 1;
let curr_page = 1;

/* On ready apply logic*/
$('document').ready(function() {
  //load pages
  /*Get the total records count*/

  get_total_counts();

});

function init_paging(){
  /*
    Function for initalising the paging tab

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */

  let content = []

  content.push("<button type='button' class='btn btn-success mr-1' onclick=get_first_page()>First</button>");
  content.push("<button type='button' class='btn btn-success mr-1' onclick=previous_slide()>Prev</button>");
  /*
    Logic for displaying pages based on current active page
  */
  let slide = Math.ceil(curr_page/4);
  let i = Math.max(4*(slide-1) + 1, 1);
  let end = Math.max(4*slide, 4);
  while ((i <= end) && (i <= pages)) {
    if (i == curr_page){
      content.push("<button type='button' class='btn btn-light mr-1 active' onclick='go_to_page("+i+")'>"+i+"</button>");
    }
    else{
      content.push("<button type='button' class='btn btn-light mr-1' onclick='go_to_page("+i+")'>"+i+"</button>");
    }

    i+=1;
  }
  //console.log(i, end, slide, pages);
  content.push("<button type='button' class='btn btn-success mr-1' onclick=next_slide()>next</button>");
  content.push("<button type='button' class='btn btn-success mr-1' onclick='get_last_page()'>last</button>");

  $('#page_items').empty();
  $('<div/>', {
    html: content.join('')
  }).appendTo('#page_items');

}

/* Function to get the total rows of data*/
function get_total_counts(){
  /*
    Function for querying the server
    --> using ajax call
    --> initialise the pages at fist load of page

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */

  $.ajax({
    url: host_url+"getCounts",
    type: 'GET',
    success: function(resp){
      total_counts = parseInt(resp);
      pages = Math.ceil(total_counts/10);
      //console.log("Total Counts : "+total_counts);
      //console.log("Total Pages : "+pages);
      init_paging();
    },
    error: function(xhr, option, err){
      console.log(err);
    }
  });
}

/*Function for paging based on page number*/
function go_to_page(n){

  /*
    Function for paging based on page number
    --> loads data for that page based on the offset

    Parameteres:
    -----------
      n: (int) active page number or (clicked page number)

    Returns:
    -----------
      no return data
  */

  /*
    Logic for getting offset for data based on page number
  */
  curr_page = parseInt(n);
  offset = (curr_page-1)*10 + 1;
  /*
    fetch data from that offset and display
  */
  fetch_data(host_url+url_call+offset);
}

/*Function for Next Slide*/
function next_slide(){
  /*
    Function for switching slides
    --> loading next set of pages in paging

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */

  let curr_slide = Math.ceil(curr_page/4);
  curr_page = 4*(curr_slide)+1;
  if (curr_page < pages){
    offset = ((curr_page-1)*10)+1;
  }
  else {
    offset = Math.floor(total_counts/10)*10;
    curr_page = pages;
  }

  fetch_data(host_url+url_call+offset);
}

function previous_slide(){
  /*
    Function for switching slides
    --> loading previous set of pages in paging

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */

  let curr_slide = Math.ceil(curr_page/4);
  curr_page = 4*(curr_slide-1);
  if (curr_page > 0){
    offset = ((curr_page-1)*10)+1;
  }
  else {
    offset = 1;
    curr_page = 1;
  }

  fetch_data(host_url+url_call+offset);
}


/*Function to go to the first */
function get_first_page(){
  /*
    Function for moving to first page
    --> loading first page data based on offset

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */
  //console.log('Fetching first page data');
  offset = 0;
  fetch_data(host_url+url_call+offset);
  curr_page = 1;
}

/*Function to got to lsast page*/
function get_last_page(){
  /*
    Function for moving to Last page
    --> loading last page data based on offset

    Parameteres:
    -----------
      no params
    Returns:
    -----------
      no return data
  */
  //console.log('Fetching last page data');
  offset = Math.floor(total_counts/10)*10;
  fetch_data(host_url+url_call+offset);
  curr_page = pages;
}
