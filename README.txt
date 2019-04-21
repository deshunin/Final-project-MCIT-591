MCIT 592 Final Project
Data Analysis and Visualization of the global trends in death rates from suicide
based on the World Health Organization databases.
team: Sergii Deshunin and Venkatesh Deshpande

This file contains a description of the Final project in the MCIT 591 course.
The primary goal of the project is to analyze the trends and correlations
in the country's mortality rates with other socioeconomic, political and
cultural factors which influence life expectancy.
To make the Project more complete and reliable we will explore only one cause of death -
self intended harm which results in the death of a person or else named suicide.

The source of the data is the site of the World Health Organization (WHO)
https://www.who.int/healthinfo/mortality_data/en/
Here are the list of source files.

1. Documentation_1 Dec2018.doc
Contains a Word file with information on the WHO Mortality Database,
file specifications and list of causes of death.
Last updated: 01 December 2018.
2.list_ctry_years_1 Dec2018.xls
Contains an Excel file with the list of countries-years available
for the mortality and population data. Last updated: 01 December 2018.
3.country_codes.csv
Country codes and names. Last updated: 03 November 2014
4.notes.csv
Notes pertaining to data for some countries-years.
Last updated: 01 December 2018.
5.pop.csv
Reference populations and live births. Last updated: 01 December 2018.
6.morticd7.csv
Data file containing the detailed mortality data for the seventh revision
of the ICD (International Classification of Diseases).
Last updated: 18 February 2004.
7.Morticd8.csv
Data file containing the detailed mortality data for the eighth revision
of the ICD (International Classification of Diseases).
Last updated: 09 July 2012.
8.Morticd9.csv
Data file containing the detailed mortality data for the ninth revision
of the ICD (International Classification of Diseases).
Last updated: 29 March 2017.
9.Morticd10_part1.csv
Data file containing the detailed mortality data for the tenth revision
of the ICD (International Classification of Diseases).
Last updated: 01 December 2018.
10.Morticd10_part2.csv
Data file containing the detailed mortality data for the tenth revision
of the ICD (International Classification of Diseases).
Last updated: 01 December 2018.

We will use several classes and methods to read, analyze and visualize data.
1. The main class named "Country" which represents an object "country" 
with instance variables "name", "code" , "male and female age groups populations",
 "gross domestic products adjusted by purchase power parity", "wellBeing index" and 
 "age group number of death" from suicide for both sexes
 2. The CountryListReader class reads data from the source files and 
 writes the corresponding values to the ArrayList of countries.
3. The Data Analysis class contains methods to compare death rates 
in different countries, in different age and sex groups, and trying 
to figure out the main trends in death rates from suicide 
and correlations with economic and other wellbeing factors.
4. The class Data Visualization contains methods to create 
charts and diagrams which show main findings from Data Analysis.
This class will use the java Swing library.


Sergii Deshunin
MCIT SEAS University of Pennsylvania
 deshunin@seas.upenn.edu
