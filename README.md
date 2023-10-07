# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل State Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي object ليه كذا state و بيتعامل مع ال objects التانيه بيشكل مختلف بناء علي ال state اللي هو فيها .. علي سبيل المثال ال example اللي متقدم في ال app ده وهو ال phone بيتعامل ازاي مع ازرار ال home و ال power بناء علي الحاله اللي هو فيها powered on, powered off, menu oppened.
# الفرق بين ال strategy design pattern و ال state design pattern؟
  - ال strategy design pattern هو اني اعمل كذا strategy و كل واحده طريقتها مختلفه عن التانيه لكن كلهم هدفهم عمل نفس العمليه و كل strategy مابيكونش عندها علم بوجود اي strategy تانيه.
  - ال state design pattern هو اني اخلي ال object بيتعامل بشكل مختلف بناء علي نوع object معين جواه (اللي هو ال state بتاعته) وبالتالي بيقوم بعمليات مختلفه بناء علي ال state اللي هو فيها و ال states بيكونوا علي علم بوجود بعض و بيبدلوا بينهم و بين بعض.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال package بتاعت ال state:
    - ال State Interface و ده فيه ال methods اللي المفروض تكون في اي state
    - ال PowerOffState Class و ده بيتعامل في حالة ان التليفون مقفول
    - ال PowerOnState Class و ده بيتعامل في حالة ان التليفون مفتوح
    - ال MenuOpenedState Class و ده بيتعامل في حالة ان القائمه الرئيسيه مفتوحه
  - ال Phone Class و ده ال class اللي بيستخدم ال state design pattern عشان يتعامل مع ازرار ال home و ال power
