-------------------
minecraft_mod_alpha
-------------------

- First attempt at building a mod for Minecraft using Forge.

-------------
Documentation
-------------

- Full Forge Documentation: https://mcforge.readthedocs.io/en/latest/

--------------------------
MACROS Used in this README
--------------------------

- $BASE: base repository directory.

--------------------------
Initial Setup Instructions
--------------------------

Note: for UNIX machines, substitute './gradlew' for 'gradlew'.

1) Clone repository: https://github.com/daltonmblack/minecraft_mod_alpha
2) Run 'gradlew setupDecompWorkspace' from $BASE.
   - Only have to do this once, unless the gradle artifact cache is deleted.
3) Choose your IDE:
   a) Eclipse
      - Run 'gradlew eclipse' from $BASE.
      - Create workspace anywhere (easiest location is one level above the
        repository's location).
      - Import repository as project into Eclipse.
   b) Sublime or command-line editor
      - Open any files you want to edit.
4) Build project with 'gradlew build'.
   - This will output '$BASE/build/libs/[archiveBaseName]-[version].jar'.
     + This .jar file can be placed directly in the 'mods' folder of a forge
       enabled Minecraft setup.

--------------------
Editing build.gradle
--------------------

- Important: DO NOT edit the 'buildscript {}' section of build.gradle.
- Make edits below the line '// EDITS GO BELOW HERE'.
- Simple build.gradle customizations:
  + [archiveBaseName]: name of the mod being built
  + [group]: "maven coordinates" (organization name)
  + [version]: version number
