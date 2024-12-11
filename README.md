Tag Issues
===

IntelliJ currently has issues resolving the tag source, so you cannot click on "Go to Declaration" if the tag source is not present.  This project is an example project, see `index.gsp` and try to go to declaration on `asset` or `sec`.  It will not work unless you first download the sources.  Open the class `AssetPipelineGrailsPlugin` as an example.  Click `Download Sources` and then confirm the warning prompt that IntelliJ gives: 

<img width="376" alt="image" src="https://github.com/user-attachments/assets/a5a11bc8-706b-4384-bbf0-82feb3a7ca7b" />

After clicking yes, the go to declarations will work.
