React Tutorial 

Learn React 

  ** React is JavaScript library for building user interfaces. 
  ** React is used to build single-page applications. 
  ** React allows us to create reusable UI components. 


Learning by Examples 

  ** Our "Show React" tool makes it easy to demonstrate React. It shows both the code and the XPathResult. 

Example 

  import React from 'react';
  import ReactDOM from 'react-dom/client';

  function Hello(props) {
    return  <h1>Hello World!</h1>;
  }

  const container = document.getElementById("root");
  const root = ReactDOM.createRoot(container);
  root.render(<Hello />);

---

Learning by Exercises 

  ** Many chapters in this tutorial end with an exercise where you can check you 
  level of knowledge. 


Exercise 

  ** What is a correct command to create a React applications

    > npx create-react-app my-team 
    > npx start-react-app my-team
    > npx init-react-app my-team 

    