-dontobfuscate
-keepattributes linenumber

# adding this rule resolves crash (it prevents R8 from merging interface with single implementation):
#-keep interface * extends com.hannesdorfmann.mosby3.mvp.MvpView
