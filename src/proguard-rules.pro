# Add any ProGuard configurations specific to this
# extension here.

-keep public class ph.bxtdev.ReadOnly.ReadOnly {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'ph/bxtdev/ReadOnly/repack'
-flattenpackagehierarchy
-dontpreverify
