function Student(name, rollno, yearOfBirth){   
    this.name= name; 
    this.rollno= rollno; 
    this.yearOfBirth= yearOfBirth; 
} 


Student.prototype.calculateAge= function(){  
    console.log('The current age is: '+(2024- this.yearOfBirth)); 
} 
console.log(Student.prototype); 
  

let std1= new Student('Karthik', 230, 2000);  
console.log(std1) ;
std1.calculateAge(); 

let std2= new Student('Keerthana', 231, 1999); 
console.log(std2) 
std2.calculateAge();

let std3= new Student('Subash', 232, 2010); 
console.log(std3) 
std3.calculateAge();