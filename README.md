# Store all your Android resources images in one folder

## Installation
Create separate module with name `widgets` in your project. All xml drawables will be converted there.

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
