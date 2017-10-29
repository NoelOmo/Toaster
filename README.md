## Toaster


[![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=9) [![](https://jitpack.io/v/noelomo/Toaster.svg)](https://jitpack.io/#noelomo/Toaster)

<div align="center">
	<img scr="https://github.com/NoelOmo/Toaster/blob/master/screenshots/the_gif.gif?raw=true">
</div>

A lightweight library for implementing custom android Toasts. Unlike the stock toasts, these ones appear at the top of your app, overlaying your actionbar/toolbar. This library is also stocked with a couple of customization options.

## Setup

Add this in your root `build.gradle` file.

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```


Add this to your module's `build.gradle` file

```gradle
dependencies {
	...
	compile 'com.github.noelomo:Toaster:1.0.0'
}
```


## Usage
This library is used in an almost similar manner as the stock Toast widget:

### Stock without any icon
 `Toaster.makeText(getApplicationContext(), "This is the DEFAULT toast", Toaster.LENGTH_SHORT, Toaster.DEFAULT).show();`
 
 ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/default.png?raw=true" width="300">
</div>
 
### Info Toast
 `Toaster.makeText(getApplicationContext(), "This is an INFO toast", Toaster.LENGTH_SHORT, Toaster.INFO).show();`
  
 ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/info.png?raw=true" width="300">
</div>

### Success Toast
 `Toaster.makeText(getApplicationContext(), "This is a SUCCESS toast", Toaster.LENGTH_SHORT, Toaster.SUCCESS).show();`
 
  ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/success.png?raw=true" width="300">
</div>

### Warning Toast
`Toaster.makeText(getApplicationContext(), "This is a WARNING toast", Toaster.LENGTH_SHORT, Toaster.WARNING).show();`

 ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/warning.png?raw=true" width="300">
</div>

### Error Toast
 `Toaster.makeText(getApplicationContext(), "This is an ERROR toast", Toaster.LENGTH_SHORT, Toaster.ERROR).show();`
 
  ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/error.png?raw=true" width="300">
</div>

### Custom Toast
  `Toaster.makeText(getApplicationContext(), "This is a CUSTOM toast", Toaster.LENGTH_SHORT, Toaster.CUSTOM, R.drawable.ic_check_circle_white_24px, R.color.default_color).show();`
  
   ####Result:
 <div align="center">
	<img src="https://github.com/NoelOmo/Toaster/blob/master/screenshots/custom.png?raw=true" width="300">
</div>

