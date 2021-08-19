/* Variables to store the url*/
let url_call = "";
let host_url = "http://localhost:8080/";
let offset = 0;

/*On ready apply logic*/
$('document').ready(function() {

  /*
    get Data without any sorting
  */

  /*Rest call for spring host*/
  url_call = "getData/";

  fetch_data(host_url+url_call+offset);

});


function display_data(data){
  /*
    Function for displaying the data fetched in table
    Parameteres:
    -----------
      data: (Json) data from server
    Returns:
    -----------
      no return data
  */

  items = [];
  for (var i = 0; i < data.length; i+=1){
    row = "<tr>";
    for (let k in data[i]){
      row += "<td>"+data[i][k]+"</td>";
    }
    row += "</tr>";
    items.push(row);
  }
  //console.log(items);
  $('#main_table').find('tbody').empty();
  $('<tbody/>', {
    html: items.join('')
  }).appendTo('#main_table');
}


function get_sorted_data(col, ord){
  /*
    Function for fetch data based on sorting parameter given
    Parameteres:
    -----------
      col: (string) which parameter need to be sorted
      ord: (string) Order of sorting ascending or descending

    Returns:
    -----------
      no return data

  */

  //console.log("\nSort CALL : "+col+" "+ord);
  url_call = "sort/"+col+"/"+ord+"/";
  fetch_data(host_url+url_call+offset);
}

function fetch_data(url){
  /*
    Function for Fetching the data from server
    --> using ajax request
    --> display the data in table
    --> set pagination

    Parameteres:
    -----------
      url: (string) url to ping

    Returns:
    -----------
      no return data
  */

  //console.log(url);
  $.ajax({
    url: url,
    type: 'GET',
    dataType:'json',
    success: function(resp){
      display_data(resp);
      init_paging();
    },
    error: function(xhr, option, err){
      console.log(err);
    }
  });
}
