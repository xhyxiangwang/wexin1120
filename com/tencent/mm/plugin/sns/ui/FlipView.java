package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.ui.widget.e.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class FlipView
  extends LinearLayout
  implements View.OnTouchListener, b.b
{
  Context context;
  private int fwh;
  private int fwi;
  protected com.tencent.mm.sdk.platformtools.ae handler;
  private long hhu;
  protected int infoType;
  private c lRF;
  float mLJ;
  float mLK;
  boolean mLL;
  float mLM;
  private double qAM;
  private double qAN;
  protected v qAO;
  protected t.a qAP;
  protected int qAQ;
  protected int qAR;
  private boolean qAS;
  private long qAT;
  boolean qAU;
  private e qAV;
  private String qAW;
  private String qAX;
  private String qAY;
  private String qAZ;
  private boolean qBa;
  private a qBb;
  private c qBc;
  
  public FlipView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8415585763328L, 62701);
    this.infoType = -1;
    this.qAM = 0.0D;
    this.qAN = 0.0D;
    this.hhu = 0L;
    this.qAS = false;
    this.qAT = 0L;
    this.qAU = false;
    this.qBa = false;
    this.qBb = new a();
    this.mLJ = 0.0F;
    this.mLK = 0.0F;
    this.mLL = false;
    this.mLM = 1.0F;
    this.lRF = new c() {};
    this.qBc = new c() {};
    init(paramContext);
    GMTrace.o(8415585763328L, 62701);
  }
  
  public FlipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8415451545600L, 62700);
    this.infoType = -1;
    this.qAM = 0.0D;
    this.qAN = 0.0D;
    this.hhu = 0L;
    this.qAS = false;
    this.qAT = 0L;
    this.qAU = false;
    this.qBa = false;
    this.qBb = new a();
    this.mLJ = 0.0F;
    this.mLK = 0.0F;
    this.mLL = false;
    this.mLM = 1.0F;
    this.lRF = new c() {};
    this.qBc = new c() {};
    init(paramContext);
    GMTrace.o(8415451545600L, 62700);
  }
  
  /* Error */
  public static String f(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc2_w 228
    //   5: ldc -26
    //   7: invokestatic 77	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: ifnull +356 -> 367
    //   14: aload_0
    //   15: ldc -24
    //   17: invokevirtual 238	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   20: ifne +347 -> 367
    //   23: new 240	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 241	java/lang/StringBuilder:<init>	()V
    //   30: getstatic 246	com/tencent/mm/compatible/util/e:gKA	Ljava/lang/String;
    //   33: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc -4
    //   38: iconst_3
    //   39: anewarray 254	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: ldc_w 256
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: aload_0
    //   51: invokevirtual 260	java/lang/String:hashCode	()I
    //   54: invokestatic 266	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: ldc_w 268
    //   63: aastore
    //   64: invokestatic 272	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: astore 7
    //   75: new 278	java/io/File
    //   78: dup
    //   79: invokestatic 284	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   82: invokevirtual 290	android/content/Context:getCacheDir	()Ljava/io/File;
    //   85: new 240	java/lang/StringBuilder
    //   88: dup
    //   89: ldc_w 292
    //   92: invokespecial 294	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: invokestatic 300	java/lang/System:currentTimeMillis	()J
    //   98: invokevirtual 303	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   101: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokespecial 306	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   107: invokevirtual 309	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   110: astore 6
    //   112: aload_0
    //   113: aload 6
    //   115: invokestatic 314	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   118: lconst_0
    //   119: lcmp
    //   120: ifge +13 -> 133
    //   123: ldc2_w 228
    //   126: ldc -26
    //   128: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: aconst_null
    //   132: areturn
    //   133: aload 6
    //   135: invokestatic 320	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   138: ifeq +277 -> 415
    //   141: aload 6
    //   143: invokestatic 324	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   146: astore 5
    //   148: aload 5
    //   150: ifnull +257 -> 407
    //   153: getstatic 330	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   156: astore 8
    //   158: new 332	java/io/FileOutputStream
    //   161: dup
    //   162: aload 7
    //   164: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   167: astore 4
    //   169: aload 4
    //   171: astore_3
    //   172: aload 5
    //   174: aload 8
    //   176: bipush 80
    //   178: aload 4
    //   180: invokevirtual 339	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   183: pop
    //   184: aload 4
    //   186: ifnull +8 -> 194
    //   189: aload 4
    //   191: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   194: aload 6
    //   196: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   199: pop
    //   200: iload_2
    //   201: ifne +129 -> 330
    //   204: aload_0
    //   205: aload 7
    //   207: invokestatic 314	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   210: lconst_0
    //   211: lcmp
    //   212: ifge +118 -> 330
    //   215: ldc2_w 228
    //   218: ldc -26
    //   220: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: aconst_null
    //   224: areturn
    //   225: astore 5
    //   227: aconst_null
    //   228: astore 4
    //   230: aload 4
    //   232: astore_3
    //   233: ldc_w 347
    //   236: aload 5
    //   238: ldc -24
    //   240: iconst_0
    //   241: anewarray 254	java/lang/Object
    //   244: invokestatic 353	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: aload 4
    //   249: ifnull +8 -> 257
    //   252: aload 4
    //   254: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   257: aload 6
    //   259: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   262: pop
    //   263: iconst_0
    //   264: istore_2
    //   265: goto -65 -> 200
    //   268: astore 5
    //   270: aconst_null
    //   271: astore 4
    //   273: aload 4
    //   275: astore_3
    //   276: ldc_w 347
    //   279: aload 5
    //   281: ldc -24
    //   283: iconst_0
    //   284: anewarray 254	java/lang/Object
    //   287: invokestatic 353	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: aload 4
    //   292: ifnull +8 -> 300
    //   295: aload 4
    //   297: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   300: aload 6
    //   302: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   305: pop
    //   306: iconst_0
    //   307: istore_2
    //   308: goto -108 -> 200
    //   311: astore_0
    //   312: aconst_null
    //   313: astore_3
    //   314: aload_3
    //   315: ifnull +7 -> 322
    //   318: aload_3
    //   319: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   322: aload 6
    //   324: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   327: pop
    //   328: aload_0
    //   329: athrow
    //   330: aload_1
    //   331: new 355	android/content/Intent
    //   334: dup
    //   335: ldc_w 357
    //   338: new 278	java/io/File
    //   341: dup
    //   342: aload 7
    //   344: invokespecial 358	java/io/File:<init>	(Ljava/lang/String;)V
    //   347: invokestatic 364	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   350: invokespecial 367	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   353: invokevirtual 371	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   356: ldc2_w 228
    //   359: ldc -26
    //   361: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   364: aload 7
    //   366: areturn
    //   367: ldc2_w 228
    //   370: ldc -26
    //   372: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   375: aconst_null
    //   376: areturn
    //   377: astore_3
    //   378: goto -184 -> 194
    //   381: astore_3
    //   382: goto -125 -> 257
    //   385: astore_3
    //   386: goto -86 -> 300
    //   389: astore_1
    //   390: goto -68 -> 322
    //   393: astore_0
    //   394: goto -80 -> 314
    //   397: astore 5
    //   399: goto -126 -> 273
    //   402: astore 5
    //   404: goto -174 -> 230
    //   407: aconst_null
    //   408: astore 4
    //   410: iconst_0
    //   411: istore_2
    //   412: goto -228 -> 184
    //   415: iconst_0
    //   416: istore_2
    //   417: goto -217 -> 200
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	paramString	String
    //   0	420	1	paramContext	Context
    //   1	416	2	i	int
    //   171	148	3	localFileOutputStream1	java.io.FileOutputStream
    //   377	1	3	localException1	Exception
    //   381	1	3	localException2	Exception
    //   385	1	3	localException3	Exception
    //   167	242	4	localFileOutputStream2	java.io.FileOutputStream
    //   146	27	5	localBitmap	android.graphics.Bitmap
    //   225	12	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   268	12	5	localOutOfMemoryError1	OutOfMemoryError
    //   397	1	5	localOutOfMemoryError2	OutOfMemoryError
    //   402	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   110	213	6	str1	String
    //   73	292	7	str2	String
    //   156	19	8	localCompressFormat	android.graphics.Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   141	148	225	java/io/FileNotFoundException
    //   153	169	225	java/io/FileNotFoundException
    //   141	148	268	java/lang/OutOfMemoryError
    //   153	169	268	java/lang/OutOfMemoryError
    //   141	148	311	finally
    //   153	169	311	finally
    //   189	194	377	java/lang/Exception
    //   252	257	381	java/lang/Exception
    //   295	300	385	java/lang/Exception
    //   318	322	389	java/lang/Exception
    //   172	184	393	finally
    //   233	247	393	finally
    //   276	290	393	finally
    //   172	184	397	java/lang/OutOfMemoryError
    //   172	184	402	java/io/FileNotFoundException
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8415719981056L, 62702);
    this.context = paramContext;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    paramContext = new DisplayMetrics();
    ((Activity)this.context).getWindowManager().getDefaultDisplay().getMetrics(paramContext);
    this.qAQ = paramContext.widthPixels;
    this.qAR = paramContext.heightPixels;
    com.tencent.mm.sdk.b.a.uLm.b(this.lRF);
    com.tencent.mm.sdk.b.a.uLm.b(this.qBc);
    GMTrace.o(8415719981056L, 62702);
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8416525287424L, 62708);
    GMTrace.o(8416525287424L, 62708);
  }
  
  public final void Ia(String paramString)
  {
    GMTrace.i(16633737248768L, 123931);
    if (FileOp.aZ(paramString))
    {
      Intent localIntent = new Intent();
      w.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { paramString });
      localIntent.putExtra("before_photo_edit", paramString);
      localIntent.putExtra("from_scene", 293);
      localIntent.putExtra("after_photo_edit", "");
      localIntent.putExtra("Retr_Compress_Type", 0);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_FromMainTimeline", blB());
      d.b(this.context, "photoedit", ".ui.MMNewPhotoEditUI", localIntent);
    }
    GMTrace.o(16633737248768L, 123931);
  }
  
  public void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8416659505152L, 62709);
    GMTrace.o(8416659505152L, 62709);
  }
  
  public void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8416927940608L, 62711);
    GMTrace.o(8416927940608L, 62711);
  }
  
  public final void bgh()
  {
    GMTrace.i(8416793722880L, 62710);
    GMTrace.o(8416793722880L, 62710);
  }
  
  public abstract long blA();
  
  public abstract boolean blB();
  
  public amn blC()
  {
    GMTrace.i(8417733246976L, 62717);
    GMTrace.o(8417733246976L, 62717);
    return null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8416256851968L, 62706);
    if (paramMotionEvent.getAction() == 0)
    {
      w.d("MicroMsg.FlipView", "onTouchEvent down");
      this.qAM = paramMotionEvent.getX();
      this.qAN = paramMotionEvent.getY();
      this.hhu = System.currentTimeMillis();
      if (g.H(paramMotionEvent) == 1) {
        this.qAS = false;
      }
    }
    if (g.H(paramMotionEvent) > 1) {
      this.qAS = true;
    }
    if ((paramMotionEvent.getAction() == 1) && (!this.qAS))
    {
      w.d("MicroMsg.FlipView", "onTouchEvent up " + (System.currentTimeMillis() - this.hhu));
      long l = bg.Pq();
      w.d("MicroMsg.FlipView", "deltTime: " + (l - this.qAT));
      if (l - this.qAT < 300L)
      {
        this.handler.removeCallbacks(this.qBb);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8672478494720L, 64615);
            GMTrace.o(8672478494720L, 64615);
          }
        });
        bool = super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(8416256851968L, 62706);
        return bool;
      }
      this.qAT = l;
      if ((System.currentTimeMillis() - this.hhu < 500L) && (Math.abs(paramMotionEvent.getX() - this.qAM) <= 10.0D) && (Math.abs(paramMotionEvent.getY() - this.qAN) <= 10.0D) && (paramMotionEvent.getY() > 110.0F) && (paramMotionEvent.getY() < this.qAR - 100))
      {
        a locala = this.qBb;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        locala.x = f1;
        locala.y = f2;
        this.handler.postDelayed(this.qBb, 10L);
      }
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(8416256851968L, 62706);
    return bool;
  }
  
  protected final void e(final String paramString1, final String paramString2, final String paramString3, boolean paramBoolean)
  {
    GMTrace.i(8417196376064L, 62713);
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    Object localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString2);
    if (localObject == null)
    {
      w.e("MicroMsg.FlipView", "error!!show long click Alert snsInfo is null!!");
      GMTrace.o(8417196376064L, 62713);
      return;
    }
    if (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 21)
    {
      if (!((com.tencent.mm.plugin.sns.storage.m)localObject).field_userName.equals(com.tencent.mm.x.m.zF()))
      {
        localArrayList1.add(this.context.getString(i.j.pSl));
        localArrayList2.add(Integer.valueOf(3));
      }
      if ((this.qAV == null) || (!this.qBa)) {
        break label674;
      }
      this.qBa = false;
    }
    for (;;)
    {
      this.qAV.qQS = new o.c()
      {
        public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
        {
          GMTrace.i(8573157376000L, 63875);
          paramAnonymousm.clear();
          int i = 0;
          while (i < localArrayList1.size())
          {
            paramAnonymousm.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
            i += 1;
          }
          GMTrace.o(8573157376000L, 63875);
        }
      };
      this.qAV.wTa = new e.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(14707981287424L, 109583);
          al localal = new al();
          localal.fuF.filePath = FlipView.a(FlipView.this);
          com.tencent.mm.sdk.b.a.uLm.m(localal);
          FlipView.b(FlipView.this);
          FlipView.c(FlipView.this);
          FlipView.a(FlipView.this, "");
          FlipView.d(FlipView.this);
          FlipView.b(FlipView.this, null);
          FlipView.a(FlipView.this, FlipView.b(FlipView.this, 0));
          GMTrace.o(14707981287424L, 109583);
        }
      };
      this.qAV.qQT = new o.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(8319083216896L, 61982);
          Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramString2);
          if (localObject1 == null)
          {
            w.i("MicroMsg.FlipView", "error beacause info null");
            GMTrace.o(8319083216896L, 61982);
            return;
          }
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(8319083216896L, 61982);
            return;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              k.h(paramString1, FlipView.e(FlipView.this));
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            FlipView.Ib(paramString2);
            GMTrace.o(8319083216896L, 61982);
            return;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              paramAnonymousMenuItem = new Intent();
              paramAnonymousMenuItem.putExtra("Retr_File_Name", paramString1);
              paramAnonymousMenuItem.putExtra("Retr_Compress_Type", 0);
              paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 0);
              if (localObject1 != null)
              {
                paramAnonymousMenuItem.putExtra("Retr_FromMainTimeline", FlipView.this.blB());
                paramAnonymousMenuItem.putExtra("Retr_KSnsId", com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1));
              }
              com.tencent.mm.plugin.sns.c.a.ifM.l(paramAnonymousMenuItem, FlipView.e(FlipView.this));
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            new StringBuilder().append(am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramString3)).append(com.tencent.mm.plugin.sns.data.i.e((amn)((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().uyu.tKd.get(0)));
            FlipView.Ic(paramString2);
            GMTrace.o(8319083216896L, 61982);
            return;
            Object localObject2;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              paramAnonymousMenuItem = new cd();
              Object localObject3 = paramString2;
              localObject2 = paramString3;
              if ((localObject2 == null) || (bg.mZ((String)localObject3)))
              {
                w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
                paramAnonymousMenuItem.fwt.fwz = i.j.dWB;
              }
              for (;;)
              {
                paramAnonymousMenuItem.fwt.fwA = 13;
                paramAnonymousMenuItem.fwt.activity = ((Activity)FlipView.e(FlipView.this));
                com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
                if (FlipView.this.blB())
                {
                  paramAnonymousMenuItem = new ow();
                  paramAnonymousMenuItem.fMU.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
                  paramAnonymousMenuItem.fMU.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
                  com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
                }
                GMTrace.o(8319083216896L, 61982);
                return;
                if (com.tencent.mm.plugin.sns.model.ae.bgY())
                {
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                  paramAnonymousMenuItem.fwt.fwz = i.j.pQY;
                }
                else
                {
                  localObject3 = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject3);
                  if (localObject3 == null)
                  {
                    w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                    paramAnonymousMenuItem.fwt.fwz = i.j.dWC;
                  }
                  else
                  {
                    com.tencent.mm.plugin.sns.i.a.a(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject3, (String)localObject2);
                  }
                }
              }
            }
            if (localObject1 == null)
            {
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) {
              FlipView.j(FlipView.this.blB(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg());
            }
            for (;;)
            {
              if (FlipView.this.blB())
              {
                paramAnonymousMenuItem = new ow();
                paramAnonymousMenuItem.fMU.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
                paramAnonymousMenuItem.fMU.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
                com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
              }
              GMTrace.o(8319083216896L, 61982);
              return;
              paramAnonymousMenuItem = new cd();
              com.tencent.mm.plugin.sns.i.a.a(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              paramAnonymousMenuItem.fwt.fwA = 14;
              paramAnonymousMenuItem.fwt.activity = ((Activity)FlipView.e(FlipView.this));
              com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
            }
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("k_expose_msg_id", FlipView.this.blA());
            paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bhp().dP(FlipView.this.blA());
            if (paramAnonymousMenuItem == null) {}
            for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = paramAnonymousMenuItem.field_userName)
            {
              ((Intent)localObject1).putExtra("k_username", paramAnonymousMenuItem);
              ((Intent)localObject1).putExtra("showShare", false);
              ((Intent)localObject1).putExtra("rawUrl", "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect33");
              ((Intent)localObject1).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
              d.b(FlipView.e(FlipView.this), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            w.i("MicroMsg.FlipView", "request deal QBAR string");
            paramAnonymousMenuItem = new by();
            paramAnonymousMenuItem.fwg.activity = ((Activity)FlipView.e(FlipView.this));
            paramAnonymousMenuItem.fwg.fuE = FlipView.f(FlipView.this);
            paramAnonymousMenuItem.fwg.fwh = FlipView.g(FlipView.this);
            paramAnonymousMenuItem.fwg.fwi = FlipView.h(FlipView.this);
            localObject1 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject1, paramString3);
            if (localObject1 != null)
            {
              paramAnonymousMenuItem.fwg.imagePath = ((amn)localObject1).mDo;
              paramAnonymousMenuItem.fwg.fwm = ((amn)localObject1).uhR;
            }
            paramAnonymousMenuItem.fwg.scene = 38;
            if ((FlipView.e(FlipView.this) instanceof Activity)) {
              paramAnonymousMenuItem.fwg.fwn = ((Activity)FlipView.e(FlipView.this)).getIntent().getBundleExtra("_stat_obj");
            }
            if ((FlipView.this instanceof SnsInfoFlip))
            {
              localObject1 = (SnsInfoFlip)FlipView.this;
              localObject2 = ((SnsInfoFlip)localObject1).pYm;
              w.d("MicroMsg.FlipView", "from Scene: %s", new Object[] { ((an)localObject2).tag });
              if ((!((an)localObject2).tag.equals(an.veU.tag)) && (!((an)localObject2).tag.equals(an.veV.tag)) && (!((an)localObject2).tag.equals(an.veW.tag))) {
                break label1151;
              }
              paramAnonymousMenuItem.fwg.fwj = 5;
              if (bg.mZ(((SnsInfoFlip)localObject1).username))
              {
                w.i("MicroMsg.FlipView", "empty username");
                ((SnsInfoFlip)localObject1).username = "";
              }
              paramAnonymousMenuItem.fwg.aEn = ((SnsInfoFlip)localObject1).username;
            }
            for (;;)
            {
              com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
              GMTrace.o(8319083216896L, 61982);
              return;
              label1151:
              if (((an)localObject2).tag.equals(an.veT.tag)) {
                paramAnonymousMenuItem.fwg.fwj = 3;
              } else {
                w.i("MicroMsg.FlipView", "other scene_from: %s", new Object[] { ((an)localObject2).tag });
              }
            }
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().uyu.tKd.size() == 0)
            {
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            paramAnonymousMenuItem = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type == 1)
            {
              paramAnonymousInt = FlipView.this.getPosition();
              int i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().uyu.tKd.size();
              if ((i > 1) && (paramAnonymousInt > 1) && (paramAnonymousInt <= i)) {
                paramAnonymousInt -= 1;
              }
              for (;;)
              {
                localObject1 = FlipView.f(paramString1, FlipView.e(FlipView.this));
                if (localObject1 != null) {
                  break;
                }
                GMTrace.o(8319083216896L, 61982);
                return;
                paramAnonymousInt = 0;
              }
              paramAnonymousMenuItem.putExtra("sns_send_data_ui_image_path", (String)localObject1);
              paramAnonymousMenuItem.putExtra("sns_send_data_ui_image_position", paramAnonymousInt);
            }
            paramAnonymousMenuItem.putExtra("sns_send_data_ui_activity", true);
            paramAnonymousMenuItem.putExtra("sns_local_id", paramString2);
            d.a(FlipView.e(FlipView.this), ".ui.chatting.ChattingSendDataToDeviceUI", paramAnonymousMenuItem);
            GMTrace.o(8319083216896L, 61982);
            return;
            FlipView.this.Ia(paramString1);
          }
        }
      };
      this.qAV.bCV();
      if ((this.qAU) && (true == paramBoolean))
      {
        h.xA();
        if (h.xy().gQO.DN() != 0)
        {
          this.qAW = paramString1;
          this.qAX = paramString2;
          this.qAY = paramString3;
          paramString2 = new mc();
          paramString2.fKl.filePath = paramString1;
          com.tencent.mm.sdk.b.a.uLm.m(paramString2);
        }
      }
      GMTrace.o(8417196376064L, 62713);
      return;
      if (!u.HT(paramString2))
      {
        localArrayList1.add(this.context.getString(i.j.eLC));
        localArrayList2.add(Integer.valueOf(1));
      }
      if (d.KT("favorite"))
      {
        localArrayList1.add(this.context.getString(i.j.euj));
        localArrayList2.add(Integer.valueOf(2));
      }
      if (!u.HT(paramString2))
      {
        if ((((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 15) || (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 5))
        {
          localArrayList1.add(this.context.getString(i.j.eCW));
          localArrayList2.add(Integer.valueOf(0));
        }
      }
      else
      {
        label402:
        df localdf = new df();
        localdf.fxU.fxL = paramString2;
        com.tencent.mm.sdk.b.a.uLm.m(localdf);
        if (localdf.fxV.fxs)
        {
          localArrayList1.add(this.context.getString(i.j.pQV));
          localArrayList2.add(Integer.valueOf(5));
        }
        if ((d.KT("photoedit")) && (!u.HT(paramString2)) && (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 1))
        {
          localArrayList1.add(this.context.getString(i.j.dIk));
          localArrayList2.add(Integer.valueOf(6));
        }
        if (this.qAZ == null) {
          break;
        }
        if (!com.tencent.mm.plugin.scanner.a.al(this.fwh, this.qAZ)) {
          break label659;
        }
      }
      label659:
      for (localObject = this.context.getString(i.j.pTC);; localObject = this.context.getString(i.j.pTB))
      {
        localArrayList1.add(localObject);
        localArrayList2.add(Integer.valueOf(4));
        break;
        if (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 1)
        {
          localArrayList1.add(this.context.getString(i.j.eCT));
          localArrayList2.add(Integer.valueOf(0));
          break label402;
        }
        localArrayList1.add(this.context.getString(i.j.pTA));
        localArrayList2.add(Integer.valueOf(0));
        break label402;
      }
      label674:
      this.qAV = new e(this.context, e.wSP, false);
    }
  }
  
  public abstract int getPosition();
  
  protected final void onDestroy()
  {
    GMTrace.i(8417599029248L, 62716);
    com.tencent.mm.sdk.b.a.uLm.c(this.lRF);
    com.tencent.mm.sdk.b.a.uLm.c(this.qBc);
    GMTrace.o(8417599029248L, 62716);
  }
  
  protected void onPause()
  {
    GMTrace.i(8417464811520L, 62715);
    this.qAW = null;
    this.qAX = "";
    this.qAY = null;
    if (this.qAZ != null)
    {
      ak localak = new ak();
      localak.fuD.activity = ((Activity)this.context);
      localak.fuD.fuE = this.qAZ;
      com.tencent.mm.sdk.b.a.uLm.m(localak);
      this.qAZ = null;
      this.fwi = 0;
      this.fwh = 0;
    }
    GMTrace.o(8417464811520L, 62715);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(8416391069696L, 62707);
    if (!g.bWx())
    {
      GMTrace.o(8416391069696L, 62707);
      return false;
    }
    GMTrace.o(8416391069696L, 62707);
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8417062158336L, 62712);
    GMTrace.o(8417062158336L, 62712);
    return true;
  }
  
  final class a
    implements Runnable
  {
    float x;
    float y;
    
    a()
    {
      GMTrace.i(8540408250368L, 63631);
      GMTrace.o(8540408250368L, 63631);
    }
    
    public final void run()
    {
      GMTrace.i(8540542468096L, 63632);
      GMTrace.o(8540542468096L, 63632);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/FlipView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */