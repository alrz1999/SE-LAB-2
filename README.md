# SE-LAB-2

## Team members
* Alireza Ziaee
* Abdollah Zohrabi

## شرح آزمایش

1- ابتدا تست‌های مربوط به `Rectangle` را نوشتیم. سپس سعی کردیم با افزودن کمترین کد تست‌های مربوط به این کلاس پاس شوند

2- تست‌هایی برای تابع‌های `get‍` و `set` فیلدهای کلاس `Rectangle` اضافه کردیم و سپس تابع‌های مربوطه را اضافه کردیم تا تست‌ها پاس شوند

3- تست‌های مربوط به کلاس مجزای `Square` را اضافه کردیم و سپس با افزودن کمترین کد به این کلاس تست‌ها را پاس کردیم

4- با توجه به مشترک بودن تابع `computeArea` برای کلاس‌های `Rectangle` و `Square` و اینکه کلاس‌ها به لحاظ مفهمومی عضو اشکال هندسی هستند، اینترفیس `Shape` را اضافه کردیم که این اینترفیس دارای تابع `computeArea` بوده و کلاس‌های `Rectangle` و `Square` این اینترفیس را پیاده‌سازی می‌کنند

5- در هر مرحله بعد از اضافه‌کردن تست‌ها و سپس اضافه‌کردن کد مربوطه برای پاس شدن تست‌ها، برای حفظ کیفیت کد، ریفکتور انجام می‌دهیم

6- برای رعایت اصول SOLID هم سعی کردیم کلاس‌ها تا جای ممکن یک کار را انجام دهند و اصل Single Responsibility تا حد خوبی رعایت شود. برای رعایت OCP پیاده‌سازی و روابط بین کلاس‌ها را تا جای ممکن به گونه‌ای قرار دادیم که برای افزودن ویژگی‌های جدید امکان اضافه کردن کد به این کلاس‌ها وجود داشته‌باشد و نیازی به تغییر کدهای موجود نباشد. برای رعایت LSP نیز پیاده‌سازی و روابط بین کلاس‌ها را به گونه‌ای قرار دادیم این اصل رعایت شود(کلاس `Square` به دلیل محدودیت‌های Precondition بیشتر نمی‌تواند از مستطیل ارثبری کند، اما اشکال هندسی می‌توانند از `Shape` ارثبری کنند و اگر بعدا ویژگی جدیدی خواستیم برای شکل‌ها اضافه کنیم، می‌توانیم signature آن را به این اینترفیس اضافه کنیم و کلاس‌های فرزند، این توابع را پیاده‌سازی کنند)

## پرسش‌ها

### 1- هر یک از پنج اصل SOLID را در دو الی سه خط توضیح دهید.
### 1. اصل تک مسئولیتی (Single Responsibility Principle): 
هرکلاس که در برنامه وجود دارد باید مسئولیتی خاص و مشخص داشته باشد. به عبارتی هرکلاس فقط وفقط مسئولیت یک عملکرد را در برنامه داشته باشد.

### 2. اصل باز - بسته (Open/Closed Principle):
اصل `OCP` بیان میکند که کد باید به گونه ای باشد که به راحتی بتوانیم ان را توسعه بدهیم(`open`) و ویژگی های جدید را به برنامه اضافه کنیم بدون این که نیاز به دستکاری کد باشه و خاصیت های اولیه کلاس را تغییر دهیم(`closed`).

### 3. اصل جایگزینی لیسکوف (Liskov Substitution Principle):
این اصل بیان میدارد که اگر `S` یک زیر کلاس از  `T` باشه، آبجکت‌های نوع `T` باید بتونن بدون تغییر دادن کد برنامه با آبجکت‌های نوع `S` جایگزین بشود.
به عبارت دیگر کلاس بچه باید هم ویژگی های کلاس پدر را به ارث ببرد و نباید ان را تغییر بدهد.

### 4. اصل جداسازی اینترفیس‌ها (Interface Segregation Principle):
اصل جداسازی اینترفیس‌ها یا `Interface Segregation Principle` بیان میکند که کلاس‌ها نباید به متدهایی که برایشان لزومی ندارد، استفاده. به عبارتی  هر کلاس فقط باید به آن متدهایی وابسته باشد که واقعاً استفاده می‌کند. این کار باعث کاهش وابستگی‌ها و اتصالات بیش از حد بین کلاس‌ها و ماژول‌ها می‌شود و امکان تغییرات در کد را اسان تر میکند.

### 5. اصل وارونگی وابستگی (Dependency Inversion Principle):
این اصل که توسط رابرت سی مارتین معرفی شده است بیان میکند که کلاس‌های سطح بالا نباید به کلاس‌های سطح پایین وابسته باشند به عبارتی  هر دو باید وابسته به `Abstractions` باشند. در واقع جزییات باید وابسته به `Abstractions` باشند نه برعکس.



### 2- اصول SOLID در کدام یک از گام‌های اصلی ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، تست و استقرار) استفاده می‌شوند؟ توضیح دهید.
### طراحی:
اصل `SRP` (تک مسئولیتی) کمک می‌کند که هر کلاس تنها به یک مسئولیت مربوط شود و در نتیجه تغییرات در یک بخش از کد تأثیر کمتری روی سایر بخش‌ها داشته باشد. اصل `OCP` هم به توسعه‌دهندگان کمک می‌کند تا قابلیت تغییر و اضافه کردن عملکردهای جدید را در کد به حداکثر ببرند بدون اینکه کد  تغییر کند.

### پیاده‌سازی:
 اصل `LSP` (جایگزینی لیسکوف) به توسعه‌دهندگان کمک می‌کند تا اصولی را رعایت کنند که به آن‌ها اجازه می‌دهد کلاس‌ها و اشیاء را با سایر نمونه‌ها جایگزین کنند بدون اینکه کد خود را خراب کنند.

### تست:
اصل `DIP` (وارونگی وابستگی) کمک می‌کند که اجزای سیستم برای مستقل بودن ماجول‌ها و کلاس‌ها قابلیت تست داشته باشند و تست کردن این اجزا را آسان‌تر کند.

### استقرار:
اصول `SOLID` به توسعه‌دهندگان کمک می‌کنند تا بهترین روش‌ها و الگوهای برنامه‌نویسی را برای استقرار کد دنبال کنند. مثلاً اصل `SRP` (مسئولیت تکی) برای جدا سازی قسمت‌های مختلف استفاده میشود تا استقرار و نگهداری نرم‌افزار را آسان‌تر کند.


### 3- در چرخه‌ی عمومی ایجاد نرم‌افزار، آزمون نرم‌افزار دیرتر از پیاده‌سازی نرم‌افزار انجام می‌شود، اما در روش TDD تست‌نویسی پیش از پیاده‌سازی شروع می‌شود. آیا این دو مورد با هم تناقضی دارند؟ توضیح دهید.
ر چرخه‌ی عمومی ایجاد نرم‌افزار، معمولاً فاز آزمون بعد از فاز پیاده‌سازی قرار می‌گیرد.به عبارتی  بعد از اینکه کد نوشته شده و قابل اجرا است، آزمون‌ها برای بررسی عملکرد و صحت نرم‌افزار اجرا می‌شوند. در این حالت نیازی به نوشتن تست‌ها قبل از پیاده‌سازی نیست و ترتیب اجرایی این فازها رعایت می‌شود.

اما در روش `TDD` تست‌ها قبل از پیاده‌سازی نوشته می‌شوند. در این روش، قبل از هر چیزی تست معتبر برای مورد کاربرد مورد نظر نوشته می‌شود و سپس کد آن قابل اجرا می‌شود. این به معنایی است که دقیقاً مشخص است که نرم‌افزار باید چه کاری انجام دهد و تمرکز اولیه بر روی نیازهای کاربران و عملکرد صحیح نرم‌افزار است.

بنابراین دوروش متفاوت هستند ولی تناقضی باهم ندارند در روش اول کلیت کار مشخص است و ما برنامه را مینویسیم وصرفا برای صحت برنامه نوشته شده تست را مینویسم درحالی که درحالت دوم خواسته ها دقیقا مشخص است و نا براساس تست ها برنامه را مینویسیم.



### 4- فرض کنید در آزمایش بالا نیازی به تغییر ابعاد مستطیل نداشتیم. آیا در این حالت می‌توانستیم مربع را از مستطیل به ارث ببریم؟ توضیح دهید.
بله. مربع را مینوان از مستطیل به ارث برد. مربع حالت خاص از مستطیل است که طول و عرض آن برابر است.پس با ارث بری از کلاس مستطیل و تغییر مقادیر طول و عرض به مقدار برابر، می‌توانیم یک شیء مربع را مدل‌سازی کنیم. همچنین،  می‌توانیم متد محاسبه مساحت را در کلاس مربع اضافه کنیم که به همان شیوه متد محاسبه مساحت مستطیل عمل می‌کند.
