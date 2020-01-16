import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { $, Session } from 'protractor';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  private url = "https://jsonplaceholder.typicode.com/users";
  data:any;

  
  chagecolor(bhai)
  {
    // sessionStorage.setItem("szdg","aedg");
  

    bhai.style.color="red";
    
  }

  chagecolor2(bhai)
  {
    bhai.style.color="black";
    
  }

  data2:any;
  constructor(private http: HttpClient ) {
    http.get(this.url).subscribe( response =>
      {
          console.log(response);
          this.data=response;
      });
   }
     
   addData(data3)
   {
     console.log(data3)
     this.http.post(this.url, data3).subscribe(response => {
      this.data.splice(0,0,this.data[7]);
     })
   }

  ngOnInit() {
  }

}
