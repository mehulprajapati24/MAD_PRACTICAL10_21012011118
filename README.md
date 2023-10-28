# MAD_PRACTICAL10_21012011118

Study: JSON Format, ListView, RecyclerView, Google Map, HttpURLConnection, CoroutineScope

AIM: Create an application to create JSON URL for Contact which have field(id, Name(First Name, Last Name), Phone No, Address) and should be minimum five contact details & display received contact data in RecyclerView. Add Google Map Activity which displays location which is received in JSON Data in google Maps activity and set the zoom level to 10.

To Generate JSON Data, Refer: https://app.json-generator.com/

Create MainActivity according to below UI design.

Use link generated from website for JSON Data

Create MapActivity by using this instructions.

Create Class Person with member Variables like id, Name, Phone No, Email Id, Address, Latitude, Longitude. This class should be inherited from Serializable class.

Generate JSON data format according to below image.

Use RecyclerView or ListView Adapter

Add Internet Permission in  Manifest file

Create Class HttpRequest for communicating with Web URL

Code for https://app.json-generator.com/ to generate JSON API
Generated Link: https://api.json-generator.com/templates/qjeKFdjkXCdK/data
Generated token: rbn0rerl1k0d3mcwgw7dva2xuwk780z1hxvyvrb1

By HttpURLConnection object it is easy to get JSON data from web url in HttpRequest Class
CoroutineScope() of kotlin is useful to fetch data from URL in background in MainActivity class
