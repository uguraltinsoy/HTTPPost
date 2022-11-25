# Android HTTPPost

## [This library has been discontinued and the new version is here](https://github.com/uguraltinsoy/MultiJSON)

### AndroidManifest
```
 <uses-permission android:name="android.permission.INTERNET"/>
```

## Download
### Build Gradle
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
```
dependencies {
	implementation 'com.github.uguraltinsoy:HTTPPost:1.0.0'
}
```
or Maven:
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
```
<dependency>
	<groupId>com.github.uguraltinsoy</groupId>
	<artifactId>HTTPPost</artifactId>
	<version>1.0.0</version>
</dependency>
```

## Usage Java - Kotlin

### POST JSON
```Java
// JAVA
JSONObject json = new JSONObject();  
json.put("param","value");  
json.put("param","value");  
json.put("param","value");  
String result = JSONPost.postJSON("URL", json);
```
```Kotlin
// KOTLIN
val json = JSONObject()  
json.put("param", "value")  
json.put("param", "value")  
json.put("param", "value")  
val result = JSONPost.postJSON("URL", json)
```

### POST JSON with Request Property or Header
```Java
// JAVA
HashMap<String, String> property = new HashMap<>();
property.put("param", "param");
property.put("param", "param");
JSONObject json = new JSONObject();  
json.put("param","value");  
json.put("param","value");  
json.put("param","value");  
String result = JSONPost.postJSON("URL", property, json);
```
```Kotlin
// KOTLIN
val property: HashMap<String, String> = HashMap()  
property["param"] = "value" 
property["param"] = "value" 
val json = JSONObject()  
json.put("param", "value")  
json.put("param", "value")  
json.put("param", "value")  
val result = JSONPost.postJSON("URL", property, json)
```
POST STRING JSON
```Java
// JAVA
String result = JSONPost.postJSON(
	"URL", 
	"{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}");
```
```Kotlin
// KOTLIN
val result = JSONPost.postJSON(  
  "URL",  
  "{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}"  
)
```

### POST STRING JSON with Request Property or Header
```Java
// JAVA
HashMap<String, String> property = new HashMap<>();
property.put("param", "value");
property.put("param", "value");
String result = JSONPost.postJSON(
	"URL",
	 property,
	 "{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}");
```
```Kotlin
// KOTLIN
val property: HashMap<String, String> = HashMap()  
property["param"] = "value"  
property["param"] = "value"   
val result = JSONPost.postJSON(
	"URL", 
	property, 
	"{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}")
```
### Developer By
```
Uğur Altınsoy
```

### Donate
```
BTC  : 1N7V3wX4xvGfwgBP1zQrcMSxohKKfiDxyH
ETH  : 0x0df6da87e219fb4854e933f1071ad91d17afa517
XRP  : rEb8TK3gBgk5auZkwc6sHnwrGVJH8DuaLh
DOGE : DKKmSHAa8GhAE5HNjmCXzkXPKTjpybY3mq
DENT : 0x0df6da87e219fb4854e933f1071ad91d17afa517
```

### Social
[![Twitter](https://img.shields.io/badge/twitter-%231DA1F2.svg?&style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/uguraltnsy)
[![Instagram](https://img.shields.io/badge/instagram-%23E4405F.svg?&style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ugur.altnsy)
[![Linkedin](https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/uğur-altınsoy/)
[![Google Play](https://img.shields.io/badge/Google%20Play-414141?logo=google-play&logoColor=white&style=for-the-badge)](https://play.google.com/store/apps/developer?id=DeepLab&hl=tr)
