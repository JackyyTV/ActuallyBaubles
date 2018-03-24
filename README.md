# ActuallyBaubles
[![Downloads](http://cf.way2muchnoise.eu/full_actually-baubles_downloads.svg)](https://minecraft.curseforge.com/projects/actually-baubles) [![MCVersion](http://cf.way2muchnoise.eu/versions/actually-baubles.svg)](https://minecraft.curseforge.com/projects/actually-baubles)

[![GitHub issues](https://img.shields.io/github/issues/JackyyTV/ActuallyBaubles.svg)](https://github.com/JackyyTV/ActuallyBaubles/issues) [![GitHub pull requests](https://img.shields.io/github/issues-pr/JackyyTV/ActuallyBaubles.svg)](https://github.com/JackyyTV/ActuallyBaubles/pulls)

[![Logo](https://i.gyazo.com/7abbb45f4ba8a3ec50efc98036fcac8b.png)](https://minecraft.curseforge.com/projects/actually-baubles)

---

## About

This is the GitHub repo for the Actually Baubles Minecraft mod, where the source code and issue tracker are in here.

Submit any bug reports / suggestions via [issue tracker](https://github.com/JackyyTV/ActuallyBaubles/issues).

[Pull requests](https://github.com/JackyyTV/ActuallyBaubles/pulls) are welcome if you would like to add features / help with bug fixes or translations.

---

## Contact Me

- Twitter - [@JackyyTV](https://twitter.com/JackyyTV)
- Discord - Jacky#3044
- Twitch - [Jackyy](https://www.twitch.tv/jackyy)
- Reddit - [Jacky1356400](https://www.reddit.com/message/compose/?to=Jacky1356400)

---

## Setting up workspace / compile the mod yourself

If you would like to set up the workspace yourself to submit PRs of features additions or bug fixes, or compile the mod, here's how you do it.

1. Clone the mod.
    - HTTPS: `git clone https://github.com/JackyyTV/ActuallyBaubles.git`
    - SSH: `git clone git@github.com:JackyyTV/ActuallyBaubles.git`
    - Or, use the GitHub desktop app to clone the repo via GUI interface.

2. Setting up the workspace, depending on what you need.
    - Decompiled source: `gradlew setupDecompWorkspace`
    - Obfuscated source: `gradlew setupDevWorkspace`
    - CI server: `gradlew setupCIWorkspace`

3. Either use `gradlew build` to build the jar file (Output is in `build/libs`), or setup the IDE if you are going to modify any codes. Both IntelliJ IDEA and Eclipse are included below since they're more popular IDEs.
    - IntelliJ IDEA: Do `gradlew idea`, open the `.ipr` file and import the gradle file, then execute the `genIntellijRuns` task in the "Gradle" tab.
    - Eclipse: Do `gradlew eclipse` and open the directory as project.
