#!/usr/bin/env bash

kotlinc -script ./kotlin/_rename_icons.kts

inp="../_icons"
out="../widgets/src/main/res/drawable"
for z in `git status -s $inp/*.svg | sed "s/A  //"`
do
    name=$(basename $z).xml
    svg2vd $z -o $name;
done

for xml in *.xml
do
    cp -n $xml $out
#    echo $xml->$out
done
rename -f 's/_xml//' $out/*.xml
rename -f 's/_svg//' $out/*.xml
rm *.xml

kotlinc -script ./kotlin/_update_drawables.kts
