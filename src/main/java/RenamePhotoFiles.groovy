// used for renaming photo file names
// when camera creates second directory with the same filenames
// and you want to have the single directory with the sequential filenames like:
// _DSC0001.JPG, _DSC0002.JPG
String directory = "D:\\tmp\\DCIM\\101D5300"
String filePrefix = "_DSC"
String fileType = ".JPG"
Integer startNumber = 1675

new File(directory).listFiles().sort{ it.name }.each { file ->
    println "file: " + file.getName()
    String newFileName = file.getParent() + "\\" + filePrefix + startNumber++ + fileType
    println "new file name: " + newFileName
    file.renameTo(new File(newFileName))
    println ""
}