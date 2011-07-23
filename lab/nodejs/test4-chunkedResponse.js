var http = require('http')

var server = http.createServer(
  function(request, response){
     response.writeHead(200, {'content-type':'text/plain'});
     response.write("Hello world\n")
     setTimeout( function() {
         response.end("later response\n")
     },2000 );

    response.write("end of the script\n")

  }  
);


server.listen(8080);
console.log("Server running at http://localhost: 8080");




