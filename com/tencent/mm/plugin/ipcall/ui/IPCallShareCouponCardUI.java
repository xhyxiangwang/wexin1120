package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.pluginsdk.ui.applet.k.b;
import com.tencent.mm.protocal.c.aej;
import com.tencent.mm.protocal.c.boo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.j.a.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class IPCallShareCouponCardUI
  extends MMActivity
  implements com.tencent.mm.ac.e, a.a, com.tencent.mm.ui.j.a.b
{
  private int DG;
  private String gEe;
  private View hT;
  private ProgressDialog ilL;
  private String mTitle;
  private ProgressDialog ncs;
  private TextView nfF;
  private TextView nfG;
  private TextView nfH;
  private TextView nfI;
  private Button nfJ;
  private ImageView nfK;
  private com.tencent.mm.ui.j.a nfL;
  private ProgressDialog nfM;
  private i nfN;
  private ImageView nfO;
  private ProgressBar nfP;
  private com.tencent.mm.plugin.ipcall.a.e.e nfQ;
  private String nfR;
  private String nfS;
  private String nfT;
  private String nfU;
  private String nfV;
  private String nfW;
  private String nfX;
  private String nfY;
  private String nfZ;
  private boo nga;
  private String ngb;
  private View ngc;
  
  public IPCallShareCouponCardUI()
  {
    GMTrace.i(11678284513280L, 87010);
    this.nfL = new com.tencent.mm.ui.j.a();
    this.ilL = null;
    this.nfM = null;
    this.nfN = null;
    this.ncs = null;
    this.nfO = null;
    this.nfP = null;
    this.nfQ = new com.tencent.mm.plugin.ipcall.a.e.e();
    this.nfR = null;
    this.gEe = null;
    this.nfS = null;
    this.mTitle = null;
    this.nfT = null;
    this.nfU = null;
    this.nfV = null;
    this.nfW = null;
    this.nfX = null;
    this.nfY = null;
    this.nfZ = null;
    this.nga = null;
    this.ngb = null;
    this.DG = 0;
    GMTrace.o(11678284513280L, 87010);
  }
  
  public static String A(Context paramContext, int paramInt)
  {
    GMTrace.i(11679358255104L, 87018);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), paramContext.getString(R.l.eii));
    localHashMap.put(Integer.valueOf(0), paramContext.getString(R.l.fbY));
    localHashMap.put(Integer.valueOf(1), paramContext.getString(R.l.ein));
    localHashMap.put(Integer.valueOf(3), paramContext.getString(R.l.eij));
    localHashMap.put(Integer.valueOf(2), paramContext.getString(R.l.eim));
    localHashMap.put(Integer.valueOf(5), paramContext.getString(R.l.eio));
    localHashMap.put(Integer.valueOf(4), paramContext.getString(R.l.eip));
    localHashMap.put(Integer.valueOf(6), paramContext.getString(R.l.eil));
    localHashMap.put(Integer.valueOf(7), paramContext.getString(R.l.eik));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramContext = (String)localHashMap.get(Integer.valueOf(paramInt));
      GMTrace.o(11679358255104L, 87018);
      return paramContext;
    }
    GMTrace.o(11679358255104L, 87018);
    return null;
  }
  
  public static void a(Context paramContext, int paramInt, TextView paramTextView, ImageView paramImageView)
  {
    GMTrace.i(11679224037376L, 87017);
    paramContext = A(paramContext, paramInt);
    if (paramContext != null) {
      paramTextView.setText(paramContext);
    }
    paramInt = pp(paramInt);
    if (paramInt != -1) {
      paramImageView.setImageResource(paramInt);
    }
    GMTrace.o(11679224037376L, 87017);
  }
  
  private static Bitmap aIq()
  {
    GMTrace.i(11680163561472L, 87024);
    Object localObject = zX(com.tencent.mm.x.m.zF());
    if (localObject == null)
    {
      GMTrace.o(11680163561472L, 87024);
      return null;
    }
    localObject = com.tencent.mm.sdk.platformtools.d.bf((byte[])localObject);
    GMTrace.o(11680163561472L, 87024);
    return (Bitmap)localObject;
  }
  
  private static boolean ag(Context paramContext, String paramString)
  {
    GMTrace.i(11679626690560L, 87020);
    if (bg.mZ(paramString))
    {
      GMTrace.o(11679626690560L, 87020);
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      GMTrace.o(11679626690560L, 87020);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      GMTrace.o(11679626690560L, 87020);
    }
    return false;
  }
  
  private void k(final int paramInt, final String paramString1, String paramString2)
  {
    GMTrace.i(11680431996928L, 87026);
    this.ngc = View.inflate(this.vov.voR, R.i.cQT, null);
    final EditText localEditText = (EditText)this.ngc.findViewById(R.h.bxg);
    this.nfO = ((ImageView)this.ngc.findViewById(R.h.bxe));
    this.nfP = ((ProgressBar)this.ngc.findViewById(R.h.bUk));
    localEditText.setText(paramString1);
    Object localObject = aIq();
    if (localObject == null)
    {
      localObject = com.tencent.mm.x.m.zF();
      ap.AS();
      localObject = new com.tencent.mm.aw.a((String)localObject, bg.e((Integer)com.tencent.mm.x.c.xi().get(66561, null)));
      ap.wT().a((k)localObject, 0);
      this.nfP.setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.applet.d.a(this.vov, paramString2, this.ngc, getResources().getString(R.l.dwY), new k.b()
      {
        public final void fy(boolean paramAnonymousBoolean)
        {
          GMTrace.i(11648622395392L, 86789);
          if (paramAnonymousBoolean)
          {
            if (localEditText == null) {}
            for (final Object localObject = paramString1;; localObject = localEditText.getText().toString())
            {
              localObject = new com.tencent.mm.modelmulti.i(paramInt, (String)localObject);
              IPCallShareCouponCardUI localIPCallShareCouponCardUI1 = IPCallShareCouponCardUI.this;
              IPCallShareCouponCardUI localIPCallShareCouponCardUI2 = IPCallShareCouponCardUI.this;
              IPCallShareCouponCardUI.this.getString(R.l.dxm);
              IPCallShareCouponCardUI.b(localIPCallShareCouponCardUI1, com.tencent.mm.ui.base.h.a(localIPCallShareCouponCardUI2, IPCallShareCouponCardUI.this.getString(R.l.dwZ), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(11674526416896L, 86982);
                  ap.wT().c(localObject);
                  GMTrace.o(11674526416896L, 86982);
                }
              }));
              ap.wT().a((k)localObject, 0);
              GMTrace.o(11648622395392L, 86789);
              return;
            }
          }
          GMTrace.o(11648622395392L, 86789);
        }
      });
      GMTrace.o(11680431996928L, 87026);
      return;
      if (this.nfO != null) {
        this.nfO.setImageBitmap((Bitmap)localObject);
      }
    }
  }
  
  public static int pp(int paramInt)
  {
    GMTrace.i(11679492472832L, 87019);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), Integer.valueOf(R.k.dlS));
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(R.k.dmE));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(R.k.dmD));
    localHashMap.put(Integer.valueOf(3), Integer.valueOf(R.k.dlT));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(R.k.dmF));
    localHashMap.put(Integer.valueOf(5), Integer.valueOf(R.k.dmG));
    localHashMap.put(Integer.valueOf(4), Integer.valueOf(R.k.dmH));
    localHashMap.put(Integer.valueOf(6), Integer.valueOf(R.k.dlU));
    localHashMap.put(Integer.valueOf(7), Integer.valueOf(R.k.dmC));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramInt = ((Integer)localHashMap.get(Integer.valueOf(paramInt))).intValue();
      GMTrace.o(11679492472832L, 87019);
      return paramInt;
    }
    GMTrace.o(11679492472832L, 87019);
    return -1;
  }
  
  private void pq(int paramInt)
  {
    GMTrace.i(11679895126016L, 87022);
    com.tencent.mm.ui.base.h.a(this.vov.voR, paramInt, R.l.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11671573626880L, 86960);
        GMTrace.o(11671573626880L, 86960);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11699222478848L, 87166);
        GMTrace.o(11699222478848L, 87166);
      }
    });
    GMTrace.o(11679895126016L, 87022);
  }
  
  /* Error */
  private static byte[] zX(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 813
    //   3: ldc_w 815
    //   6: invokestatic 103	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 716	com/tencent/mm/x/ap:AS	()Lcom/tencent/mm/x/c;
    //   12: pop
    //   13: invokestatic 818	com/tencent/mm/x/c:yV	()Ljava/lang/String;
    //   16: astore_1
    //   17: invokestatic 716	com/tencent/mm/x/ap:AS	()Lcom/tencent/mm/x/c;
    //   20: pop
    //   21: aload_1
    //   22: invokestatic 821	com/tencent/mm/x/c:yW	()Ljava/lang/String;
    //   25: ldc_w 823
    //   28: aload_0
    //   29: invokevirtual 827	java/lang/String:getBytes	()[B
    //   32: invokestatic 832	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   35: ldc_w 834
    //   38: invokestatic 839	com/tencent/mm/sdk/platformtools/h:f	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   41: astore_0
    //   42: aload_0
    //   43: invokestatic 636	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   46: ifeq +22 -> 68
    //   49: ldc -25
    //   51: ldc_w 841
    //   54: invokestatic 596	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: ldc2_w 813
    //   60: ldc_w 815
    //   63: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   66: aconst_null
    //   67: areturn
    //   68: new 843	java/io/RandomAccessFile
    //   71: dup
    //   72: aload_0
    //   73: ldc_w 845
    //   76: invokespecial 847	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: astore_1
    //   80: aload_1
    //   81: astore_0
    //   82: aload_1
    //   83: invokevirtual 851	java/io/RandomAccessFile:length	()J
    //   86: l2i
    //   87: newarray <illegal type>
    //   89: astore_2
    //   90: aload_1
    //   91: astore_0
    //   92: aload_1
    //   93: aload_2
    //   94: invokevirtual 855	java/io/RandomAccessFile:read	([B)I
    //   97: pop
    //   98: aload_1
    //   99: invokevirtual 858	java/io/RandomAccessFile:close	()V
    //   102: ldc2_w 813
    //   105: ldc_w 815
    //   108: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: aload_2
    //   112: areturn
    //   113: astore_2
    //   114: aconst_null
    //   115: astore_1
    //   116: aload_1
    //   117: astore_0
    //   118: ldc -25
    //   120: aload_2
    //   121: ldc_w 468
    //   124: iconst_0
    //   125: anewarray 397	java/lang/Object
    //   128: invokestatic 862	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: aload_1
    //   132: ifnull +7 -> 139
    //   135: aload_1
    //   136: invokevirtual 858	java/io/RandomAccessFile:close	()V
    //   139: ldc2_w 813
    //   142: ldc_w 815
    //   145: invokestatic 156	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: aconst_null
    //   149: areturn
    //   150: astore_1
    //   151: aconst_null
    //   152: astore_0
    //   153: aload_0
    //   154: ifnull +7 -> 161
    //   157: aload_0
    //   158: invokevirtual 858	java/io/RandomAccessFile:close	()V
    //   161: aload_1
    //   162: athrow
    //   163: astore_0
    //   164: goto -62 -> 102
    //   167: astore_0
    //   168: goto -29 -> 139
    //   171: astore_0
    //   172: goto -11 -> 161
    //   175: astore_1
    //   176: goto -23 -> 153
    //   179: astore_2
    //   180: goto -64 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	paramString	String
    //   16	120	1	localObject1	Object
    //   150	12	1	localObject2	Object
    //   175	1	1	localObject3	Object
    //   89	23	2	arrayOfByte	byte[]
    //   113	8	2	localException1	Exception
    //   179	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   68	80	113	java/lang/Exception
    //   68	80	150	finally
    //   98	102	163	java/lang/Exception
    //   135	139	167	java/lang/Exception
    //   157	161	171	java/lang/Exception
    //   82	90	175	finally
    //   92	98	175	finally
    //   118	131	175	finally
    //   82	90	179	java/lang/Exception
    //   92	98	179	java/lang/Exception
  }
  
  protected final int Qb()
  {
    GMTrace.i(11678418731008L, 87011);
    GMTrace.o(11678418731008L, 87011);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11679089819648L, 87016);
    String str;
    final Object localObject1;
    Object localObject2;
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.g)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.hT.setVisibility(0);
        paramString = com.tencent.mm.plugin.ipcall.b.c.aIF();
        if (paramString != null)
        {
          this.nfR = paramString.tZX;
          this.gEe = paramString.mCK;
          this.nfS = paramString.tZY;
          this.mTitle = paramString.fuw;
          this.nfT = paramString.nat;
          this.nfU = paramString.tZZ;
          this.nfW = paramString.uaa;
          this.nfX = paramString.uab;
          this.nfY = paramString.uac;
          this.nfZ = paramString.uae;
          this.nga = paramString.uad;
          this.ngb = paramString.uaf;
        }
        this.nfF.setText(this.nfZ);
        this.nfG.setText(String.format(this.vov.voR.getString(R.l.ejc), new Object[] { this.nfR }));
        this.nfJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11639764025344L, 86723);
            IPCallShareCouponCardUI.a(IPCallShareCouponCardUI.this);
            GMTrace.o(11639764025344L, 86723);
          }
        });
        this.nfH.setText(String.format(getString(R.l.eje), new Object[] { this.nfZ }));
        paramk = this.nfI;
        str = String.format(getString(R.l.ejd), new Object[] { this.nfZ });
        localObject1 = getString(R.l.ejg);
        if (bg.mZ((String)localObject1))
        {
          paramk.setText(str);
          if ((this.ncs != null) && (this.ncs.isShowing())) {
            this.ncs.dismiss();
          }
          GMTrace.o(11679089819648L, 87016);
          return;
        }
        paramString = getString(R.l.eji);
        localObject2 = paramk.getPaint();
        float f1 = ((TextPaint)localObject2).measureText(str);
        float f2 = ((TextPaint)localObject2).measureText(paramString);
        paramInt1 = com.tencent.mm.bq.a.ef(this.vov.voR);
        paramInt2 = ((LinearLayout.LayoutParams)paramk.getLayoutParams()).leftMargin;
        paramInt1 -= ((LinearLayout.LayoutParams)paramk.getLayoutParams()).rightMargin + paramInt2;
        paramInt2 = (int)Math.ceil(f1 / paramInt1);
        int i = (int)Math.ceil((f1 + f2) / paramInt1);
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = 1;
        }
        if (i <= paramInt1) {
          break label789;
        }
        paramString = "\n" + paramString;
      }
    }
    label789:
    for (;;)
    {
      paramk.setGravity(17);
      localObject2 = Spannable.Factory.getInstance().newSpannable(str + paramString);
      localObject1 = new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11654527975424L, 86833);
          ((TextView)paramAnonymousView).setHighlightColor(IPCallShareCouponCardUI.this.getResources().getColor(R.e.transparent));
          com.tencent.mm.plugin.report.service.g.paX.i(13340, new Object[] { Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(1) });
          com.tencent.mm.ui.base.h.b(IPCallShareCouponCardUI.this.vov.voR, localObject1, IPCallShareCouponCardUI.this.getString(R.l.ejj), true).a(R.l.ehA, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11637884977152L, 86709);
              GMTrace.o(11637884977152L, 86709);
            }
          });
          GMTrace.o(11654527975424L, 86833);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(11654662193152L, 86834);
          paramAnonymousTextPaint.setColor(IPCallShareCouponCardUI.this.getResources().getColor(R.e.aOU));
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(11654662193152L, 86834);
        }
      };
      paramInt1 = str.length();
      paramInt2 = str.length();
      ((Spannable)localObject2).setSpan(localObject1, paramInt1, paramString.length() + paramInt2, 33);
      paramk.setText((CharSequence)localObject2);
      paramk.setMovementMethod(LinkMovementMethod.getInstance());
      break;
      if ((this.ncs != null) && (this.ncs.isShowing()))
      {
        this.ncs.dismiss();
        com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.ehO), getString(R.l.ehK), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11651843620864L, 86813);
            IPCallShareCouponCardUI.this.finish();
            GMTrace.o(11651843620864L, 86813);
          }
        });
        GMTrace.o(11679089819648L, 87016);
        return;
        if ((paramk instanceof com.tencent.mm.modelmulti.i))
        {
          if (this.ilL != null)
          {
            this.ilL.dismiss();
            this.ilL = null;
          }
          if (com.tencent.mm.plugin.subapp.b.ifN.b(this.vov.voR, paramInt1, paramInt2, paramString))
          {
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            com.tencent.mm.ui.base.h.h(this.vov.voR, R.l.eFR, R.l.dxm);
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dLG));
          GMTrace.o(11679089819648L, 87016);
          return;
        }
        if ((paramk instanceof com.tencent.mm.aw.a))
        {
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            GMTrace.o(11679089819648L, 87016);
            return;
          }
          if (this.nfO != null)
          {
            if (this.nfP != null) {
              this.nfP.setVisibility(8);
            }
            this.nfO.setImageBitmap(aIq());
          }
        }
      }
      GMTrace.o(11679089819648L, 87016);
      return;
    }
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(11679760908288L, 87021);
    if (this.nfM != null) {
      this.nfM.cancel();
    }
    switch (8.ngk[paramc.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(11679760908288L, 87021);
      return;
      pq(R.l.eNk);
      GMTrace.o(11679760908288L, 87021);
      return;
      GMTrace.o(11679760908288L, 87021);
      return;
      pq(R.l.eNj);
    }
  }
  
  public final void b(a.c paramc)
  {
    GMTrace.i(11680029343744L, 87023);
    GMTrace.o(11680029343744L, 87023);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11678955601920L, 87015);
    int i = R.i.cXP;
    GMTrace.o(11678955601920L, 87015);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11680566214656L, 87027);
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      if (!bg.mZ(paramIntent)) {
        com.tencent.mm.pluginsdk.ui.applet.d.a(this.vov, this.mTitle, this.nfS, this.gEe, null, true, getResources().getString(R.l.dwY), new k.a()
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(11668352401408L, 86936);
            if (paramAnonymousBoolean)
            {
              Object localObject = new f.a();
              ((f.a)localObject).title = IPCallShareCouponCardUI.d(IPCallShareCouponCardUI.this);
              ((f.a)localObject).url = IPCallShareCouponCardUI.e(IPCallShareCouponCardUI.this);
              ((f.a)localObject).description = IPCallShareCouponCardUI.f(IPCallShareCouponCardUI.this);
              ((f.a)localObject).thumburl = IPCallShareCouponCardUI.g(IPCallShareCouponCardUI.this);
              ((f.a)localObject).type = 5;
              l.a((f.a)localObject, null, null, paramIntent, "", null, null);
              if (!bg.mZ(paramAnonymousString))
              {
                localObject = new ob();
                ((ob)localObject).fMk.fMl = paramIntent;
                ((ob)localObject).fMk.content = paramAnonymousString;
                ((ob)localObject).fMk.type = o.fY(paramIntent);
                ((ob)localObject).fMk.flags = 0;
                com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
              }
              com.tencent.mm.ui.base.h.bl(IPCallShareCouponCardUI.this.vov.voR, IPCallShareCouponCardUI.this.getResources().getString(R.l.dxe));
              GMTrace.o(11668352401408L, 86936);
              return;
            }
            GMTrace.o(11668352401408L, 86936);
          }
        });
      }
    }
    GMTrace.o(11680566214656L, 87027);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11678552948736L, 87012);
    super.onCreate(paramBundle);
    oC(R.l.ejh);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11690632544256L, 87102);
        IPCallShareCouponCardUI.this.finish();
        GMTrace.o(11690632544256L, 87102);
        return true;
      }
    });
    this.hT = findViewById(R.h.layout);
    this.nfF = ((TextView)findViewById(R.h.bzv));
    this.nfG = ((TextView)findViewById(R.h.bAd));
    this.nfH = ((TextView)findViewById(R.h.bzu));
    this.nfI = ((TextView)findViewById(R.h.bzw));
    this.nfJ = ((Button)findViewById(R.h.cxx));
    this.nfK = ((ImageView)findViewById(R.h.bOA));
    this.hT.setVisibility(8);
    com.tencent.mm.pluginsdk.ui.a.b.a(this.nfK, com.tencent.mm.x.m.zF(), 0.5F, false);
    paramBundle = this.vov.voR;
    getString(R.l.dxm);
    this.ncs = com.tencent.mm.ui.base.h.a(paramBundle, getString(R.l.ehQ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11632113614848L, 86666);
        try
        {
          IPCallShareCouponCardUI.this.finish();
          GMTrace.o(11632113614848L, 86666);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.IPCallShareCouponCardUI", "loadFromSystemAddressBook error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
          GMTrace.o(11632113614848L, 86666);
        }
      }
    });
    com.tencent.mm.plugin.ipcall.a.f.b.aHQ().ft(false);
    this.DG = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
    ap.wT().a(257, this);
    ap.wT().a(1804, this);
    GMTrace.o(11678552948736L, 87012);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11678821384192L, 87014);
    super.onDestroy();
    ap.wT().b(257, this);
    ap.wT().b(1804, this);
    GMTrace.o(11678821384192L, 87014);
  }
  
  protected void onResume()
  {
    GMTrace.i(11678687166464L, 87013);
    super.onResume();
    GMTrace.o(11678687166464L, 87013);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */