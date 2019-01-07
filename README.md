# panel

[![Build Status](https://travis-ci.com/Jamlee/panel.svg?branch=master)](https://travis-ci.com/Jamlee/panel)

it is a crazy simple control panel on Windows and Ubuntu, supporting followed list:

- Ubuntu 
- WindowsServer2012
- WindowsServer2008 
- WindowsServer2003

## Developer Usage

```
# start frontend server
lein fig -- -b dev -r 

# compile to jar package
lein fig -- -bo dev; lein ring uberjar

```

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
