//http://momentjs.com/downloads/moment.js

load("moment.js")

var Collections = new JavaImporter(java.util);

print("Hello, World! at "+moment().format('MMMM Do YYYY, h:mm:ss'));

with(Collections) {
   var evens = new ArrayList();

   for(var i=1;i<=10;i++) {
	if(i % 2 == 0) {
		evens.add(i);				
	}
   }

   print("Even Numbers : "+evens);
}



