[![Build Status](https://secure.travis-ci.org/siilisolutions/lein-cucumber.png)](http://travis-ci.org/siilisolutions/lein-cucumber)

# lein-cucumber

This is a leiningen plugin for use with [cucumber-jvm](https://github.com/cucumber/cucumber-jvm).
This is a fork of [lein-cucumber](http://github.com/nilswloka/lein-cucumber) with more up to date dependencies.

[![Clojars Project](https://img.shields.io/clojars/v/com.siili/lein-cucumber.svg)](http://clojars.org/com.siili/lein-cucumber)

## Usage

1. Add `[com.siili/lein-cucumber "1.0.7"]` to `:plugins` in your project.clj
2. Run `lein deps` to fetch all dependencies.
3. Run all Cucumber features with `lein cucumber`

## Please note

lein-cucumber requires Leiningen 2.

## Configuration

Feature paths are resolved in the following order:

1. Command line options (e.g. `lein cucumber my-features`) override all other settings.
2. If no command line options for feature paths are given, the `:feature-paths` parameter of the map in `:cucumber` parameter of your project.clj will be used (e.g. `:cucumber {:feature-paths ["test/features/"]}`).
3. If neither command line options nor a parameter is used, lein-cucumber looks for features in the `features/` directory.

Glue paths are resolved similarily:

1. Command line options (e.g. `lein cucumber --glue somewhere/my_stepdefs`) override all other settings.
2. If no command line options for glue paths are given, step definitions will be loaded from `step_definitions/` directories inside your feature directories.

Formatted output

1. Results are only printed to the console unless you specify a formatter
2. you can specify a formatter in the `:formatter` parameter of the project parameter `:cucumber` by specifying a keyword or string with a name of a formatter or a map with `:type` key specifying formatter type similarly and `:path` key specifying the path oart of the formatter (for example `:cucumber {:formatter {:type :html :path "target/test-reports"}}`)
3. You an also specify the reporter by a command line parameter. For example to create an HTML report you can run the plugin with the following command `lein cucumber --plugin html:target/test-reports`

## Other settings

 The following settings are hard-coded into the plugin:

* A summary report will be printed to the console.
* Leiningen will exit with the exit status of the cucumber-jvm [runtime](https://github.com/cucumber/cucumber-jvm/blob/master/core/src/main/java/cucumber/runtime/Runtime.java).

See https://github.com/nilswloka/cucumber-jvm/tree/new-clojure-example/examples/clojure_cukes for an example project.

## Note

If you like original lein-cucumber, consider endorsing the original coder at: [coderwall](http://coderwall.com/nilswloka)

[![endorse](http://api.coderwall.com/nilswloka/endorsecount.png)](http://coderwall.com/nilswloka)

If you like my additions to the configuration and more up to date versions, consider endorsing me at: [coderwall](https://coderwall.com/Verneri)

[![endorse](https://api.coderwall.com/Verneri/endorsecount.png)](https://coderwall.com/Verneri)

## Unlicense

Originally written by Nils Wloka, 2012
Additions made by Jeremy Anderson, 2015
and Verneri Åberg 2015. For licensing information, see UNLICENSE.

Please have a look at http://unlicense.org if you plan to contribute.
