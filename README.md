ViewModel and ViewModelFactory - Starter Code
==================================
En:
Use as starter code for the ViewModel codelab.
Es:
Usar como código de inicio para el codelab de ViewModel

Respuestas a preguntas del codelab
---------------------------------

1. Para evitar perder datos durante un cambio de configuración del dispositivo, los datos de la aplicación se deben guardar en la clase `ViewModel`
2. Cierto es que, un `ViewModel` nunca debe contener referencias a fragmentos, actividades o vistas
3. El `ViewModel` se destruye cuando Cuando el controlador de IU asociado está terminado (si es una actividad) o desconectado (si es un fragmento).
4. La interfaz `ViewModelFactory` sirve para instanciar un objeto `ViewModel`

Uso de ViewModel y ViewModelFactory
-----------------------------------


Implementando LiveData
----------------------

En GameViewModel Se cambió el tipo de las variables word y score quedando así:
~~~ kotlin
var word = MutableLiveData<String>()
var score = MutableLiveData<Int>()
~~~



Introduction
------------

This starter app is a two player game, GuessTheWord. It is a word guessing app you can play with one or more friends. To play, hold the device in landscape, facing away from you with your thumbs on the **Skip** and **Got It** buttons. Your friends can then give you clues to help you guess the word. If you get the word right, press **Got It**. If you're stuck, press **Skip**.
You will modify the app to use Architecture components and best practices.

License
-------

Copyright 2019 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
