# COM528AE2 - Shopping Application Program 

## How to run project

Clone this repo
```
git clone https://github.com/hannahannx/COM528AE2.git
```


Open Netbeans, right click the IDE and select "Open Project"

![OpenProject](https://user-images.githubusercontent.com/72127228/148647825-eb199c75-8006-4216-9803-ce0ef757835e.png)

Select the shopping-cart-application and select "Open Project"

![SearchProjectFile](https://user-images.githubusercontent.com/72127228/148647865-88febeba-abea-4fb7-a37d-d406d372ad10.png)

Right click the shooping-cart-application and select "Build with dependencies"

![BuildWithDependentcies](https://user-images.githubusercontent.com/72127228/148647924-bd807108-e98b-4bf0-8140-1bd32853404e.png)



At the base of project (from command line/terminal) write the code
```
mvn clean install
```
Move to web module directory
```
cd web
```

IMPORTANT! - BEFORE RUNNING THE PROJECT ENSURE ALL LOCAL PORTS ARE CLOSE OR PROJECT WILL NOT RUN
Run project
```
mvn spring-boot:run
```
The project will be available at : http://localhost:8080/index.html
