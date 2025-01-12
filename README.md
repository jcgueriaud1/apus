# Apus

[![All Tests](https://github.com/McPringle/apus/actions/workflows/all-tests.yml/badge.svg)](https://github.com/McPringle/apus/actions/workflows/all-tests.yml)

**A social wall for conferences with additional features.**

The name *Apus* is based on Apus Apus, Latin for common swift. This is a bird species that is extremely adapted to a life in the air and can stay in the air for around ten months almost without interruption and can reach speeds of more than 200 km/h during flight maneuvers. This bird breeds in a wall, flies reliably for extremely long periods without crashing and is also extremely fast. Hopefully all of this also applies to Apus: fast execution, uninterrupted and reliable operation!

See:

* https://en.wikipedia.org/wiki/Common_swift
* https://en.wikipedia.org/wiki/Apus_(bird)

## Features

### Show posts from Social Media

| Platform                    | Status           |
|-----------------------------|------------------|
| Bluesky                     | planned          |
| Instagram                   | planned          |
| Mastodon                    | work in progress |
| Twitter                     | planned          |

### Show event agenda

| Event              | Status           |
|--------------------|------------------|
| BaselOne           | planned          |
| CyberLand          | work in progress |
| JavaLand           | work in progress |
| Voxxed Days Zürich | planned          |

### And more

| Feature                   | Status  |
|---------------------------|---------|
| Running text with updates | planned |
| Show sponsor information  | planned |
| Use event based styling   | planned |

## Running and debugging

### Running from the command line.

To run from the command line, use `mvn` and open http://localhost:8080 in your browser.

### Running and debugging in Intellij IDEA

- Locate the `Application.java` class in the project view. It is in the `src` folder, under the main package's root.
- Right-click on the `Application` class
- Select "Debug 'Application.main()'" from the list

After the server has started, you can view the UI at http://localhost:8080/ in your browser.
You can now also attach breakpoints in code for debugging purposes, by clicking next to a line number in any source file.

### Running and debugging in Eclipse

- Locate the `Application.java` class in the package explorer. It is in `src/main/java`, under the main package.
- Right-click on the file and select `Debug As` --> `Java Application`.

Do not worry if the debugger breaks at a `SilentExitException`. This is a Spring Boot feature and happens on every startup.

After the server has started, you can view it at http://localhost:8080/ in your browser.
You can now also attach breakpoints in code for debugging purposes, by clicking next to a line number in any source file.

## Copyright and License

[AGPL License](https://www.gnu.org/licenses/agpl-3.0.de.html)

*Copyright (C) Marcus Fihlon and the individual contributors to **Apus**.*

This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
