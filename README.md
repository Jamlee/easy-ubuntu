# panel

[![Build Status](https://travis-ci.com/Jamlee/panel.svg?branch=master)](https://travis-ci.com/Jamlee/panel)

it is a crazy simple control panel on Windows and Ubuntu, supporting followed list:

- Ubuntu 16.04 / 18.04
- WindowsServer 2012
- WindowsServer 2008 
- WindowsServer 2003

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
