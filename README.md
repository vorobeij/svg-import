# Store all your Android resources images in one folder

## Features
1. Import all project icons into one folder to see all icons from file manager.
1. Convert only new svg files (changed for git)

## Installation
1. Install https://github.com/alexjlockwood/svg2vd
1. Create separate module with name `widgets` in your project. All xml drawables will be converted there.

### Run from console
``` bash
cd <Your app project directory>
mkdir _scripts
mkdir _icons_exported # import your svg icons here from Designer tools
mkdir _icons # renamed icons are stored here
```
Save content of repository to `_scripts` folder

## Usage
``` bash
cd <Your app project directory>/_scripts
sh ./_update_drawables.sh
```
