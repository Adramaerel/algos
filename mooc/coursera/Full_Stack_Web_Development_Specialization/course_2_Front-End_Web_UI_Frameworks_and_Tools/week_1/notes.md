Notes from Jogesh K. Muppala. Course from the coursera website.

# What is full stack web development ?

First, let's define _front end or client-side_ and _back end or server-side_ and _three Tier Architecture_.

_Front end_ is about presenting the data to the users (technologies as HTML, CSS and Javascript are used).

_Back end_ is concerned with the business logic (technologies as Php, Java, Ruby... are used).

_Three Tier Architecture_ a common client-server software architecture pattern is divided in three layers : _presentation layer or front end_, concerned with the UI related issues, _business logic layer or back end_, concerned with data valisation and data processing and _data access layer_ wich deals with data persistence and storage of data.

These layers ofently use different languages for their implementation, so they need 3 type of specialist.

_Full Stack Web development_ use a single language for implementation over the entire stack. For exemple, we could be having the front implemented in a Javascript Framework like AngularJS, the server-side implemented using NodeJS wich is another framework of Javascript, and the data access layer implemented in JSON.

# Course outline

We will be introduced to :

	* Bootstrap
	* Node.js and NPM
	* Bower

#Introduction to Bootstrap

## Front-end Web UI Frameworks : an introduction

What are they ?
	Front-end Web UI Frameworks are collection of ready-to-use HTML, CSS and Javascript templates for UI components (typography, forms, buttons, tables...).

Why to use them ?

	* Response web design (help us to make the website accessible for all types of screen size)
	* cross-browser compatibility
	* Increased productivity
	* Community support

Popular front-end UI frameworks

	* Bootstrap
	* Foundation by Zurb
	* Semantic UI
	* Pure
	* UI Kit
	* Gumby
	* Susy

## Introduction to Bootstrap

	Bootstrap is widely used for website design. It includes HTML and CSS based design templates for many components and has built-in support for creating responsive designs with mobile first approach.

## Getting started with Bootstrap

	Download Bootstrap at get http://getbootstrap.com, unzip the archive and then we can launch an HelloWorld with :

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <h1>Hello, world!</h1>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>


