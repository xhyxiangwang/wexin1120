package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.k;

public class YANumberPicker
  extends View
{
  private int Ri;
  private VelocityTracker ez;
  private q hO;
  int jHN;
  int jHO;
  private int jHP;
  private int jHQ;
  private int jHR;
  private int jHS;
  private int jHT;
  private int jHU;
  private int jHV;
  private int jHW;
  int jHX;
  private int jHY;
  int jHZ;
  private boolean jIA;
  private boolean jIB;
  private boolean jIC;
  private boolean jID;
  private boolean jIE;
  Paint jIF;
  private TextPaint jIG;
  private Paint jIH;
  private String[] jII;
  private CharSequence[] jIJ;
  private CharSequence[] jIK;
  private Handler jIL;
  private Handler jIM;
  public a jIN;
  private b jIO;
  private int jIP;
  private int jIQ;
  private int jIR;
  private int jIS;
  private float jIT;
  private float jIU;
  private float jIV;
  private boolean jIW;
  private int jIX;
  private int jIY;
  private int jIZ;
  private int jIa;
  private int jIb;
  private int jIc;
  private int jId;
  private int jIe;
  private int jIf;
  private int jIg;
  int jIh;
  int jIi;
  private int jIj;
  private int jIk;
  private int jIl;
  private int jIm;
  private int jIn;
  private int jIo;
  private int jIp;
  private String jIq;
  public String jIr;
  private String jIs;
  private String jIt;
  private float jIu;
  private float jIv;
  private float jIw;
  private float jIx;
  private boolean jIy;
  private boolean jIz;
  private float jJa;
  private float jJb;
  private float jJc;
  private int jJd;
  private int jJe;
  private int jJf;
  private int jJg;
  private int jJh;
  private HandlerThread mHandlerThread;
  private boolean mHasInit;
  private int xq;
  
  public YANumberPicker(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17641578168320L, 131440);
    this.jHN = -13421773;
    this.jHO = -695533;
    this.jHP = -695533;
    this.jHQ = 0;
    this.jHR = 0;
    this.jHS = 0;
    this.jHT = 0;
    this.jHU = 0;
    this.jHV = 0;
    this.jHW = 0;
    this.jHX = 0;
    this.jHY = 0;
    this.jHZ = -695533;
    this.Ri = 2;
    this.jIa = 0;
    this.jIb = 0;
    this.jIc = 3;
    this.jId = 0;
    this.jIe = 0;
    this.jIf = -1;
    this.jIg = -1;
    this.jIh = 0;
    this.jIi = 0;
    this.jIj = 0;
    this.jIk = 0;
    this.jIl = 0;
    this.jIm = 0;
    this.jIn = 0;
    this.jIo = 150;
    this.jIp = 8;
    this.jIu = 1.0F;
    this.jIv = 0.0F;
    this.jIw = 0.0F;
    this.jIx = 0.0F;
    this.jIy = true;
    this.jIz = true;
    this.jIA = false;
    this.mHasInit = false;
    this.jIB = true;
    this.jIC = false;
    this.jID = false;
    this.jIE = true;
    this.jIF = new Paint();
    this.jIG = new TextPaint();
    this.jIH = new Paint();
    this.xq = 0;
    this.jIT = 0.0F;
    this.jIU = 0.0F;
    this.jIV = 0.0F;
    this.jIW = false;
    this.jJd = 0;
    this.jJe = 0;
    this.jJf = 0;
    this.jJg = 0;
    this.jJh = 0;
    init(paramContext);
    GMTrace.o(17641578168320L, 131440);
  }
  
  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17641712386048L, 131441);
    this.jHN = -13421773;
    this.jHO = -695533;
    this.jHP = -695533;
    this.jHQ = 0;
    this.jHR = 0;
    this.jHS = 0;
    this.jHT = 0;
    this.jHU = 0;
    this.jHV = 0;
    this.jHW = 0;
    this.jHX = 0;
    this.jHY = 0;
    this.jHZ = -695533;
    this.Ri = 2;
    this.jIa = 0;
    this.jIb = 0;
    this.jIc = 3;
    this.jId = 0;
    this.jIe = 0;
    this.jIf = -1;
    this.jIg = -1;
    this.jIh = 0;
    this.jIi = 0;
    this.jIj = 0;
    this.jIk = 0;
    this.jIl = 0;
    this.jIm = 0;
    this.jIn = 0;
    this.jIo = 150;
    this.jIp = 8;
    this.jIu = 1.0F;
    this.jIv = 0.0F;
    this.jIw = 0.0F;
    this.jIx = 0.0F;
    this.jIy = true;
    this.jIz = true;
    this.jIA = false;
    this.mHasInit = false;
    this.jIB = true;
    this.jIC = false;
    this.jID = false;
    this.jIE = true;
    this.jIF = new Paint();
    this.jIG = new TextPaint();
    this.jIH = new Paint();
    this.xq = 0;
    this.jIT = 0.0F;
    this.jIU = 0.0F;
    this.jIV = 0.0F;
    this.jIW = false;
    this.jJd = 0;
    this.jJe = 0;
    this.jJf = 0;
    this.jJg = 0;
    this.jJh = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    GMTrace.o(17641712386048L, 131441);
  }
  
  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17641846603776L, 131442);
    this.jHN = -13421773;
    this.jHO = -695533;
    this.jHP = -695533;
    this.jHQ = 0;
    this.jHR = 0;
    this.jHS = 0;
    this.jHT = 0;
    this.jHU = 0;
    this.jHV = 0;
    this.jHW = 0;
    this.jHX = 0;
    this.jHY = 0;
    this.jHZ = -695533;
    this.Ri = 2;
    this.jIa = 0;
    this.jIb = 0;
    this.jIc = 3;
    this.jId = 0;
    this.jIe = 0;
    this.jIf = -1;
    this.jIg = -1;
    this.jIh = 0;
    this.jIi = 0;
    this.jIj = 0;
    this.jIk = 0;
    this.jIl = 0;
    this.jIm = 0;
    this.jIn = 0;
    this.jIo = 150;
    this.jIp = 8;
    this.jIu = 1.0F;
    this.jIv = 0.0F;
    this.jIw = 0.0F;
    this.jIx = 0.0F;
    this.jIy = true;
    this.jIz = true;
    this.jIA = false;
    this.mHasInit = false;
    this.jIB = true;
    this.jIC = false;
    this.jID = false;
    this.jIE = true;
    this.jIF = new Paint();
    this.jIG = new TextPaint();
    this.jIH = new Paint();
    this.xq = 0;
    this.jIT = 0.0F;
    this.jIU = 0.0F;
    this.jIV = 0.0F;
    this.jIW = false;
    this.jJd = 0;
    this.jJe = 0;
    this.jJf = 0;
    this.jJg = 0;
    this.jJh = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    GMTrace.o(17641846603776L, 131442);
  }
  
  private static float a(Paint.FontMetrics paramFontMetrics)
  {
    GMTrace.i(17644933611520L, 131465);
    if (paramFontMetrics == null)
    {
      GMTrace.o(17644933611520L, 131465);
      return 0.0F;
    }
    float f = Math.abs(paramFontMetrics.top + paramFontMetrics.bottom) / 2.0F;
    GMTrace.o(17644933611520L, 131465);
    return f;
  }
  
  private static int a(float paramFloat, int paramInt1, int paramInt2)
  {
    GMTrace.i(17646812659712L, 131479);
    int j = (paramInt1 & 0xFF000000) >>> 24;
    int k = (paramInt1 & 0xFF0000) >>> 16;
    int i = (paramInt1 & 0xFF00) >>> 8;
    paramInt1 = (paramInt1 & 0xFF) >>> 0;
    float f = j;
    j = (int)((((0xFF000000 & paramInt2) >>> 24) - j) * paramFloat + f);
    f = k;
    k = (int)((((0xFF0000 & paramInt2) >>> 16) - k) * paramFloat + f);
    f = i;
    i = (int)((((0xFF00 & paramInt2) >>> 8) - i) * paramFloat + f);
    f = paramInt1;
    paramInt1 = (int)((((paramInt2 & 0xFF) >>> 0) - paramInt1) * paramFloat + f);
    GMTrace.o(17646812659712L, 131479);
    return j << 24 | k << 16 | i << 8 | paramInt1;
  }
  
  private static int a(CharSequence paramCharSequence, Paint paramPaint)
  {
    GMTrace.i(17645873135616L, 131472);
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      int i = (int)(paramPaint.measureText(paramCharSequence.toString()) + 0.5F);
      GMTrace.o(17645873135616L, 131472);
      return i;
    }
    GMTrace.o(17645873135616L, 131472);
    return 0;
  }
  
  private static int a(CharSequence[] paramArrayOfCharSequence, Paint paramPaint)
  {
    int j = 0;
    GMTrace.i(17645738917888L, 131471);
    if (paramArrayOfCharSequence == null)
    {
      GMTrace.o(17645738917888L, 131471);
      return 0;
    }
    int m = paramArrayOfCharSequence.length;
    int i = 0;
    while (i < m)
    {
      CharSequence localCharSequence = paramArrayOfCharSequence[i];
      int k = j;
      if (localCharSequence != null) {
        k = Math.max(a(localCharSequence, paramPaint), j);
      }
      i += 1;
      j = k;
    }
    GMTrace.o(17645738917888L, 131471);
    return j;
  }
  
  private int adm()
  {
    GMTrace.i(17643054563328L, 131451);
    int i = this.jIg;
    int j = this.jIf;
    GMTrace.o(17643054563328L, 131451);
    return i - j + 1;
  }
  
  private int adn()
  {
    GMTrace.i(17643859869696L, 131457);
    int i;
    if (this.jJe != 0) {
      if (this.jJe < -this.jIZ / 2) {
        i = kk(this.jJf + this.jIZ + this.jJe);
      }
    }
    for (;;)
    {
      GMTrace.o(17643859869696L, 131457);
      return i;
      i = kk(this.jJf + this.jJe);
      continue;
      i = kk(this.jJf);
    }
  }
  
  private void ado()
  {
    GMTrace.i(17644530958336L, 131462);
    this.jIR = 0;
    this.jIS = (-this.jIc * this.jIZ);
    if (this.jII != null)
    {
      this.jIR = ((adm() - this.jIc / 2 - 1) * this.jIZ);
      this.jIS = (-(this.jIc / 2) * this.jIZ);
    }
    GMTrace.o(17644530958336L, 131462);
  }
  
  private void adp()
  {
    GMTrace.i(17645336264704L, 131468);
    this.jJd = ((int)Math.floor(this.jJf / this.jIZ));
    this.jJe = (-(this.jJf - this.jJd * this.jIZ));
    if (this.jIO != null) {
      if (-this.jJe <= this.jIZ / 2) {
        break label137;
      }
    }
    label137:
    for (this.jIQ = (this.jJd + 1 + this.jIc / 2);; this.jIQ = (this.jJd + this.jIc / 2))
    {
      this.jIQ %= adm();
      if (this.jIQ < 0) {
        this.jIQ += adm();
      }
      this.jIP = this.jIQ;
      GMTrace.o(17645336264704L, 131468);
      return;
    }
  }
  
  private void adq()
  {
    GMTrace.i(17646007353344L, 131473);
    if (this.jII.length <= this.jIc) {}
    for (boolean bool = false;; bool = true)
    {
      this.jIB = bool;
      GMTrace.o(17646007353344L, 131473);
      return;
    }
  }
  
  private void adr()
  {
    GMTrace.i(17646141571072L, 131474);
    if ((this.hO != null) && (!this.hO.isFinished()))
    {
      this.hO.startScroll(0, this.hO.getCurrY(), 0, 0, 1);
      this.hO.abortAnimation();
      postInvalidate();
    }
    GMTrace.o(17646141571072L, 131474);
  }
  
  private static int b(Context paramContext, float paramFloat)
  {
    GMTrace.i(17646544224256L, 131477);
    int i = (int)(paramContext.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F);
    GMTrace.o(17646544224256L, 131477);
    return i;
  }
  
  private static Message b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    GMTrace.i(17646410006528L, 131476);
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    GMTrace.o(17646410006528L, 131476);
    return localMessage;
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(17641980821504L, 131443);
    if (paramAttributeSet == null)
    {
      GMTrace.o(17641980821504L, 131443);
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.k.izh);
    int k = localTypedArray.getIndexCount();
    int i = 0;
    if (i < k)
    {
      int j = localTypedArray.getIndex(i);
      if (j == p.k.izz) {
        this.jIc = localTypedArray.getInt(j, 3);
      }
      for (;;)
      {
        i += 1;
        break;
        if (j == p.k.izl)
        {
          this.jHZ = localTypedArray.getColor(j, -695533);
        }
        else if (j == p.k.izm)
        {
          this.Ri = localTypedArray.getDimensionPixelSize(j, 2);
        }
        else if (j == p.k.izn)
        {
          this.jIa = localTypedArray.getDimensionPixelSize(j, 0);
        }
        else if (j == p.k.izo)
        {
          this.jIb = localTypedArray.getDimensionPixelSize(j, 0);
        }
        else
        {
          if (j == p.k.izB)
          {
            CharSequence[] arrayOfCharSequence = localTypedArray.getTextArray(j);
            if (arrayOfCharSequence == null) {
              paramAttributeSet = null;
            }
            for (;;)
            {
              this.jII = paramAttributeSet;
              break;
              paramAttributeSet = new String[arrayOfCharSequence.length];
              j = 0;
              while (j < arrayOfCharSequence.length)
              {
                paramAttributeSet[j] = arrayOfCharSequence[j].toString();
                j += 1;
              }
            }
          }
          if (j == p.k.izD) {
            this.jHN = localTypedArray.getColor(j, -13421773);
          } else if (j == p.k.izE) {
            this.jHO = localTypedArray.getColor(j, -695533);
          } else if (j == p.k.izC) {
            this.jHP = localTypedArray.getColor(j, -695533);
          } else if (j == p.k.izH) {
            this.jHQ = localTypedArray.getDimensionPixelSize(j, b(paramContext, 13.0F));
          } else if (j == p.k.izI) {
            this.jHR = localTypedArray.getDimensionPixelSize(j, b(paramContext, 15.0F));
          } else if (j == p.k.izG) {
            this.jHS = localTypedArray.getDimensionPixelSize(j, b(paramContext, 14.0F));
          } else if (j == p.k.izw) {
            this.jIf = localTypedArray.getInteger(j, 0);
          } else if (j == p.k.izv) {
            this.jIg = localTypedArray.getInteger(j, 0);
          } else if (j == p.k.izJ) {
            this.jIz = localTypedArray.getBoolean(j, true);
          } else if (j == p.k.izA) {
            this.jIy = localTypedArray.getBoolean(j, true);
          } else if (j == p.k.izq) {
            this.jIq = localTypedArray.getString(j);
          } else if (j == p.k.izi) {
            this.jIt = localTypedArray.getString(j);
          } else if (j == p.k.izp) {
            this.jIs = localTypedArray.getString(j);
          } else if (j == p.k.izu) {
            this.jHV = localTypedArray.getDimensionPixelSize(j, c(paramContext, 8.0F));
          } else if (j == p.k.izt) {
            this.jHW = localTypedArray.getDimensionPixelSize(j, c(paramContext, 8.0F));
          } else if (j == p.k.izs) {
            this.jHX = localTypedArray.getDimensionPixelSize(j, c(paramContext, 2.0F));
          } else if (j == p.k.izr) {
            this.jHY = localTypedArray.getDimensionPixelSize(j, c(paramContext, 5.0F));
          } else if (j == p.k.izj) {
            this.jIJ = localTypedArray.getTextArray(j);
          } else if (j == p.k.izk) {
            this.jIK = localTypedArray.getTextArray(j);
          } else if (j == p.k.izy) {
            this.jID = localTypedArray.getBoolean(j, false);
          } else if (j == p.k.izx) {
            this.jIE = localTypedArray.getBoolean(j, true);
          } else if (j == p.k.izF) {
            this.jIr = localTypedArray.getString(j);
          }
        }
      }
    }
    localTypedArray.recycle();
    GMTrace.o(17641980821504L, 131443);
  }
  
  private static int c(Context paramContext, float paramFloat)
  {
    GMTrace.i(17646678441984L, 131478);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    GMTrace.o(17646678441984L, 131478);
    return i;
  }
  
  private void cX(boolean paramBoolean)
  {
    GMTrace.i(17645470482432L, 131469);
    float f = this.jIG.getTextSize();
    this.jIG.setTextSize(this.jHR);
    this.jIj = a(this.jII, this.jIG);
    this.jIl = a(this.jIJ, this.jIG);
    this.jIm = a(this.jIK, this.jIG);
    this.jIG.setTextSize(this.jHS);
    this.jHU = a(this.jIt, this.jIG);
    this.jIG.setTextSize(f);
    f = this.jIG.getTextSize();
    this.jIG.setTextSize(this.jHR);
    this.jIk = ((int)(this.jIG.getFontMetrics().bottom - this.jIG.getFontMetrics().top + 0.5D));
    this.jIG.setTextSize(f);
    if ((paramBoolean) && ((this.jJg == Integer.MIN_VALUE) || (this.jJh == Integer.MIN_VALUE))) {
      this.jIM.sendEmptyMessage(3);
    }
    GMTrace.o(17645470482432L, 131469);
  }
  
  private void g(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17643994087424L, 131458);
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + paramInt1 + ", maxShowIndex is " + paramInt2 + ".");
    }
    if (this.jII == null) {
      throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + paramInt1);
    }
    if (paramInt1 > this.jII.length - 1) {
      throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.jII.length - 1) + " minShowIndex is " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + paramInt2);
    }
    if (paramInt2 > this.jII.length - 1) {
      throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.jII.length - 1) + " maxShowIndex is " + paramInt2);
    }
    this.jIf = paramInt1;
    this.jIg = paramInt2;
    if (paramBoolean)
    {
      this.jIn = (this.jIf + 0);
      if ((!this.jIz) || (!this.jIB)) {
        break label295;
      }
    }
    label295:
    for (paramBoolean = true;; paramBoolean = false)
    {
      v(0, paramBoolean);
      postInvalidate();
      GMTrace.o(17643994087424L, 131458);
      return;
    }
  }
  
  private static int h(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17644396740608L, 131461);
    if (paramInt2 <= 0)
    {
      GMTrace.o(17644396740608L, 131461);
      return 0;
    }
    if (paramBoolean)
    {
      int i = paramInt1 % paramInt2;
      paramInt1 = i;
      if (i < 0) {
        paramInt1 = i + paramInt2;
      }
      GMTrace.o(17644396740608L, 131461);
      return paramInt1;
    }
    GMTrace.o(17644396740608L, 131461);
    return paramInt1;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17642115039232L, 131444);
    this.hO = q.a(paramContext, null);
    this.jIo = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    this.jIp = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    if (this.jHQ == 0) {
      this.jHQ = b(paramContext, 13.0F);
    }
    if (this.jHR == 0) {
      this.jHR = b(paramContext, 15.0F);
    }
    if (this.jHS == 0) {
      this.jHS = b(paramContext, 14.0F);
    }
    if (this.jHV == 0) {
      this.jHV = c(paramContext, 8.0F);
    }
    if (this.jHW == 0) {
      this.jHW = c(paramContext, 8.0F);
    }
    this.jIF.setColor(this.jHZ);
    this.jIF.setAntiAlias(true);
    this.jIF.setStyle(Paint.Style.STROKE);
    this.jIF.setStrokeWidth(this.Ri);
    this.jIG.setColor(this.jHN);
    this.jIG.setAntiAlias(true);
    this.jIG.setTextAlign(Paint.Align.CENTER);
    this.jIH.setColor(this.jHP);
    this.jIH.setAntiAlias(true);
    this.jIH.setTextAlign(Paint.Align.CENTER);
    this.jIH.setTextSize(this.jHS);
    if (this.jIc % 2 == 0) {
      this.jIc += 1;
    }
    if ((this.jIf == -1) || (this.jIg == -1))
    {
      if (this.jII == null)
      {
        this.jII = new String[1];
        this.jII[0] = "0";
      }
      adq();
      if (this.jIf == -1) {
        this.jIf = 0;
      }
      if (this.jIg == -1) {
        this.jIg = (this.jII.length - 1);
      }
      g(this.jIf, this.jIg, false);
    }
    initHandler();
    GMTrace.o(17642115039232L, 131444);
  }
  
  private void initHandler()
  {
    GMTrace.i(17642249256960L, 131445);
    this.mHandlerThread = new HandlerThread("HandlerThread-For-Refreshing");
    this.mHandlerThread.start();
    this.jIL = new Handler(this.mHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        int j = 0;
        GMTrace.i(17648825925632L, 131494);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(17648825925632L, 131494);
          return;
          if (!YANumberPicker.a(YANumberPicker.this).isFinished())
          {
            if (YANumberPicker.b(YANumberPicker.this) == 0) {
              YANumberPicker.b(YANumberPicker.this, 1);
            }
            YANumberPicker.c(YANumberPicker.this).sendMessageDelayed(YANumberPicker.c(1, 0, 0, paramAnonymousMessage.obj), 32L);
            GMTrace.o(17648825925632L, 131494);
            return;
          }
          int i;
          if (YANumberPicker.d(YANumberPicker.this) != 0)
          {
            if (YANumberPicker.b(YANumberPicker.this) == 0) {
              YANumberPicker.b(YANumberPicker.this, 1);
            }
            if (YANumberPicker.d(YANumberPicker.this) < -YANumberPicker.e(YANumberPicker.this) / 2)
            {
              j = (int)((YANumberPicker.e(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this)) * 300.0F / YANumberPicker.e(YANumberPicker.this));
              q localq = YANumberPicker.a(YANumberPicker.this);
              i = YANumberPicker.f(YANumberPicker.this);
              int k = YANumberPicker.e(YANumberPicker.this);
              localq.startScroll(0, i, 0, YANumberPicker.d(YANumberPicker.this) + k, j * 3);
              i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this) + YANumberPicker.e(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this));
              YANumberPicker.this.postInvalidate();
            }
          }
          for (;;)
          {
            paramAnonymousMessage = YANumberPicker.c(2, YANumberPicker.g(YANumberPicker.this), i, paramAnonymousMessage.obj);
            if (!YANumberPicker.h(YANumberPicker.this)) {
              break label428;
            }
            YANumberPicker.i(YANumberPicker.this).sendMessageDelayed(paramAnonymousMessage, j * 2);
            GMTrace.o(17648825925632L, 131494);
            return;
            j = (int)(-YANumberPicker.d(YANumberPicker.this) * 300.0F / YANumberPicker.e(YANumberPicker.this));
            YANumberPicker.a(YANumberPicker.this).startScroll(0, YANumberPicker.f(YANumberPicker.this), 0, YANumberPicker.d(YANumberPicker.this), j * 3);
            i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this) + YANumberPicker.d(YANumberPicker.this));
            break;
            YANumberPicker.b(YANumberPicker.this, 0);
            i = YANumberPicker.c(YANumberPicker.this, YANumberPicker.f(YANumberPicker.this));
          }
          label428:
          YANumberPicker.c(YANumberPicker.this).sendMessageDelayed(paramAnonymousMessage, j * 2);
          GMTrace.o(17648825925632L, 131494);
          return;
          YANumberPicker.a(YANumberPicker.this, paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, paramAnonymousMessage.obj);
        }
      }
    };
    this.jIM = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(17650436538368L, 131506);
        super.handleMessage(paramAnonymousMessage);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(17650436538368L, 131506);
          return;
          YANumberPicker.this.requestLayout();
          GMTrace.o(17650436538368L, 131506);
          return;
          YANumberPicker.a(YANumberPicker.this, paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, paramAnonymousMessage.obj);
        }
      }
    };
    GMTrace.o(17642249256960L, 131445);
  }
  
  private void kj(int paramInt)
  {
    GMTrace.i(17644128305152L, 131459);
    if (this.xq == paramInt)
    {
      GMTrace.o(17644128305152L, 131459);
      return;
    }
    this.xq = paramInt;
    GMTrace.o(17644128305152L, 131459);
  }
  
  private int kk(int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(17644262522880L, 131460);
    if (this.jIZ == 0)
    {
      GMTrace.o(17644262522880L, 131460);
      return 0;
    }
    paramInt /= this.jIZ;
    int i = this.jIc / 2;
    int j = adm();
    boolean bool1 = bool2;
    if (this.jIz)
    {
      bool1 = bool2;
      if (this.jIB) {
        bool1 = true;
      }
    }
    paramInt = h(paramInt + i, j, bool1);
    if ((paramInt >= 0) && (paramInt < adm()))
    {
      i = this.jIf;
      GMTrace.o(17644262522880L, 131460);
      return paramInt + i;
    }
    throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + paramInt + " getOneRecycleSize() : " + adm() + " mWrapSelectorWheel : " + this.jIz);
  }
  
  private int kl(int paramInt)
  {
    GMTrace.i(17644665176064L, 131463);
    if ((this.jIz) && (this.jIB))
    {
      GMTrace.o(17644665176064L, 131463);
      return paramInt;
    }
    int i;
    if (paramInt < this.jIS) {
      i = this.jIS;
    }
    for (;;)
    {
      GMTrace.o(17644665176064L, 131463);
      return i;
      i = paramInt;
      if (paramInt > this.jIR) {
        i = this.jIR;
      }
    }
  }
  
  private void v(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17645067829248L, 131466);
    this.jJd = (paramInt - (this.jIc - 1) / 2);
    this.jJd = h(this.jJd, adm(), paramBoolean);
    if (this.jIZ == 0)
    {
      this.jIA = true;
      GMTrace.o(17645067829248L, 131466);
      return;
    }
    this.jJf = (this.jJd * this.jIZ);
    this.jIP = (this.jJd + this.jIc / 2);
    this.jIP %= adm();
    if (this.jIP < 0) {
      this.jIP += adm();
    }
    this.jIQ = this.jIP;
    adp();
    GMTrace.o(17645067829248L, 131466);
  }
  
  public final void ads()
  {
    GMTrace.i(17646275788800L, 131475);
    adr();
    if (this.jIL != null) {
      this.jIL.sendMessageDelayed(b(1, 0, 0, null), 0L);
    }
    GMTrace.o(17646275788800L, 131475);
  }
  
  public void computeScroll()
  {
    GMTrace.i(17645202046976L, 131467);
    if (this.jIZ == 0)
    {
      GMTrace.o(17645202046976L, 131467);
      return;
    }
    if (this.hO.computeScrollOffset())
    {
      this.jJf = this.hO.getCurrY();
      adp();
      postInvalidate();
    }
    GMTrace.o(17645202046976L, 131467);
  }
  
  public final int getValue()
  {
    GMTrace.i(17643591434240L, 131455);
    int i = adn();
    int j = this.jIh;
    GMTrace.o(17643591434240L, 131455);
    return i + j;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(17642786127872L, 131449);
    super.onAttachedToWindow();
    if ((this.mHandlerThread == null) || (!this.mHandlerThread.isAlive())) {
      initHandler();
    }
    GMTrace.o(17642786127872L, 131449);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(17642920345600L, 131450);
    super.onDetachedFromWindow();
    this.mHandlerThread.quit();
    if (this.jIZ == 0)
    {
      GMTrace.o(17642920345600L, 131450);
      return;
    }
    if (!this.hO.isFinished())
    {
      this.hO.abortAnimation();
      this.jJf = this.hO.getCurrY();
      adp();
      if (this.jJe != 0)
      {
        if (this.jJe >= -this.jIZ / 2) {
          break label180;
        }
        this.jJf = (this.jJf + this.jIZ + this.jJe);
      }
    }
    for (;;)
    {
      adp();
      kj(0);
      int i = kk(this.jJf);
      if ((i != this.jIn) && (this.jID)) {}
      try
      {
        if (this.jIN != null) {
          this.jIN.a(this, this.jIh + i);
        }
        this.jIn = i;
        GMTrace.o(17642920345600L, 131450);
        return;
        label180:
        this.jJf += this.jJe;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17645604700160L, 131470);
    super.onDraw(paramCanvas);
    float f3 = 0.0F;
    int j = 0;
    float f4;
    label75:
    float f1;
    float f2;
    label179:
    String str;
    TextPaint localTextPaint;
    if (j < this.jIc + 1)
    {
      f4 = this.jJe + this.jIZ * j;
      int i = this.jJd;
      int k = adm();
      boolean bool;
      if ((this.jIz) && (this.jIB))
      {
        bool = true;
        k = h(i + j, k, bool);
        if (j != this.jIc / 2) {
          break label345;
        }
        f1 = (this.jIZ + this.jJe) / this.jIZ;
        i = a(f1, this.jHN, this.jHO);
        float f5 = this.jHQ;
        float f6 = this.jHR;
        f2 = this.jIv;
        float f7 = this.jIw;
        f3 = f1;
        f2 += (f7 - f2) * f1;
        f1 = f5 + (f6 - f5) * f1;
        this.jIG.setColor(i);
        this.jIG.setTextSize(f1);
        if ((k < 0) || (k >= adm())) {
          break label562;
        }
        str = this.jII[(this.jIf + k)];
        if (this.jIr == null) {
          break label763;
        }
        localTextPaint = this.jIG;
        f1 = getWidth() - this.jHY * 2;
        localObject = this.jIr;
        i = -1;
        switch (((String)localObject).hashCode())
        {
        }
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          throw new IllegalArgumentException("Illegal text ellipsize type.");
          bool = false;
          break label75;
          label345:
          if (j == this.jIc / 2 + 1)
          {
            i = a(1.0F - f3, this.jHN, this.jHO);
            f1 = this.jHQ;
            f1 = (1.0F - f3) * (this.jHR - f1) + f1;
            f2 = this.jIv;
            f2 = (1.0F - f3) * (this.jIw - f2) + f2;
            break label179;
          }
          i = this.jHN;
          f1 = this.jHQ;
          f2 = this.jIv;
          break label179;
          if (((String)localObject).equals("start"))
          {
            i = 0;
            continue;
            if (((String)localObject).equals("middle"))
            {
              i = 1;
              continue;
              if (((String)localObject).equals("end")) {
                i = 2;
              }
            }
          }
          break;
        }
      }
      localObject = TextUtils.TruncateAt.START;
    }
    label494:
    label562:
    label763:
    for (Object localObject = TextUtils.ellipsize(str, localTextPaint, f1, (TextUtils.TruncateAt)localObject);; localObject = str)
    {
      paramCanvas.drawText(((CharSequence)localObject).toString(), this.jJc, f2 + (f4 + this.jIZ / 2), this.jIG);
      for (;;)
      {
        j += 1;
        break;
        localObject = TextUtils.TruncateAt.MIDDLE;
        break label494;
        localObject = TextUtils.TruncateAt.END;
        break label494;
        if (!TextUtils.isEmpty(this.jIs)) {
          paramCanvas.drawText(this.jIs, this.jJc, f2 + (f4 + this.jIZ / 2), this.jIG);
        }
      }
      if (this.jIy)
      {
        paramCanvas.drawLine(getPaddingLeft() + this.jIa, this.jJa, this.jIX - getPaddingRight() - this.jIb, this.jJa, this.jIF);
        paramCanvas.drawLine(getPaddingLeft() + this.jIa, this.jJb, this.jIX - getPaddingRight() - this.jIb, this.jJb, this.jIF);
      }
      if (!TextUtils.isEmpty(this.jIq)) {
        paramCanvas.drawText(this.jIq, this.jJc + (this.jIj + this.jHT) / 2 + this.jHV, (this.jJa + this.jJb) / 2.0F + this.jIx, this.jIH);
      }
      GMTrace.o(17645604700160L, 131470);
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(17642383474688L, 131446);
    super.onMeasure(paramInt1, paramInt2);
    cX(false);
    int k = View.MeasureSpec.getMode(paramInt1);
    this.jJg = k;
    int j = View.MeasureSpec.getSize(paramInt1);
    if (k == 1073741824)
    {
      paramInt1 = j;
      j = View.MeasureSpec.getMode(paramInt2);
      this.jJh = j;
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (j != 1073741824) {
        break label220;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(17642383474688L, 131446);
      return;
      if (Math.max(this.jHT, this.jHU) == 0)
      {
        paramInt1 = 0;
        label106:
        if (Math.max(this.jHT, this.jHU) != 0) {
          break label212;
        }
      }
      label212:
      for (int i = 0;; i = this.jHV)
      {
        int m = this.jIl;
        int n = Math.max(this.jIj, this.jIm);
        i = Math.max(m, (paramInt1 + (i + Math.max(this.jHT, this.jHU)) + this.jHY * 2) * 2 + n) + (getPaddingLeft() + getPaddingRight());
        paramInt1 = i;
        if (k != Integer.MIN_VALUE) {
          break;
        }
        paramInt1 = Math.min(i, j);
        break;
        paramInt1 = this.jHW;
        break label106;
      }
      label220:
      i = this.jIc * (this.jIk + this.jHX * 2) + (getPaddingTop() + getPaddingBottom());
      if (j == Integer.MIN_VALUE) {
        paramInt2 = Math.min(i, paramInt2);
      } else {
        paramInt2 = i;
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17642517692416L, 131447);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.jIX = paramInt1;
    this.jIY = paramInt2;
    this.jIZ = (this.jIY / this.jIc);
    this.jJc = ((this.jIX + getPaddingLeft() - getPaddingRight()) / 2.0F);
    if (adm() > 1) {
      if (this.mHasInit) {
        paramInt1 = getValue() - this.jIh;
      }
    }
    for (;;)
    {
      if ((this.jIz) && (this.jIB)) {}
      for (boolean bool = true;; bool = false)
      {
        v(paramInt1, bool);
        if (this.jHQ > this.jIZ) {
          this.jHQ = this.jIZ;
        }
        if (this.jHR > this.jIZ) {
          this.jHR = this.jIZ;
        }
        if (this.jIH != null) {
          break label202;
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
        if (this.jIA)
        {
          paramInt1 = this.jJd + (this.jIc - 1) / 2;
          break;
        }
        paramInt1 = 0;
        break;
      }
      label202:
      this.jIH.setTextSize(this.jHS);
      this.jIx = a(this.jIH.getFontMetrics());
      this.jHT = a(this.jIq, this.jIH);
      if (this.jIG == null) {
        throw new IllegalArgumentException("mPaintText should not be null.");
      }
      this.jIG.setTextSize(this.jHR);
      this.jIw = a(this.jIG.getFontMetrics());
      this.jIG.setTextSize(this.jHQ);
      this.jIv = a(this.jIG.getFontMetrics());
      ado();
      this.jId = (this.jIc / 2);
      this.jIe = (this.jId + 1);
      this.jJa = (this.jId * this.jIY / this.jIc);
      this.jJb = (this.jIe * this.jIY / this.jIc);
      if (this.jIa < 0) {
        this.jIa = 0;
      }
      if (this.jIb < 0) {
        this.jIb = 0;
      }
      if ((this.jIa + this.jIb != 0) && (getPaddingLeft() + this.jIa >= this.jIX - getPaddingRight() - this.jIb))
      {
        paramInt1 = getPaddingLeft() + this.jIa + getPaddingRight() + this.jIb - this.jIX;
        this.jIa = ((int)(this.jIa - paramInt1 * this.jIa / (this.jIa + this.jIb)));
        this.jIb = ((int)(this.jIb - paramInt1 * this.jIb / (this.jIa + this.jIb)));
      }
      this.mHasInit = true;
      GMTrace.o(17642517692416L, 131447);
      return;
      paramInt1 = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17644799393792L, 131464);
    if (this.jIZ == 0)
    {
      GMTrace.o(17644799393792L, 131464);
      return true;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    this.jIV = paramMotionEvent.getY();
    int i;
    label243:
    int j;
    int k;
    label341:
    label403:
    int n;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
    case 1: 
      do
      {
        float f;
        do
        {
          for (;;)
          {
            GMTrace.o(17644799393792L, 131464);
            return true;
            this.jIW = true;
            this.jIL.removeMessages(1);
            adr();
            this.jIU = this.jIV;
            this.jIT = this.jJf;
            kj(0);
            getParent().requestDisallowInterceptTouchEvent(true);
            continue;
            f = this.jIU - this.jIV;
            if ((!this.jIW) || (-this.jIp >= f) || (f >= this.jIp))
            {
              this.jIW = false;
              this.jJf = kl((int)(f + this.jIT));
              adp();
              invalidate();
            }
            kj(1);
          }
          if (!this.jIW) {
            break;
          }
          f = paramMotionEvent.getY();
          i = 0;
        } while (i >= this.jIc);
        if ((this.jIZ * i > f) || (f >= this.jIZ * (i + 1))) {
          break;
        }
      } while ((i < 0) || (i >= this.jIc));
      i -= this.jIc / 2;
      if (this.jIz)
      {
        j = i;
        if (this.jIB) {}
      }
      else
      {
        k = adn();
        if (k + i <= this.jIg) {
          break;
        }
        j = this.jIg - k;
      }
      if (this.jJe < -this.jIZ / 2)
      {
        k = this.jIZ + this.jJe;
        i = (int)(300.0F * (this.jIZ + this.jJe) / this.jIZ);
        if (j < 0)
        {
          i = -i - j * 300;
          n = this.jIZ;
          if (i >= 300) {
            break label737;
          }
          i = 300;
        }
      }
      break;
    }
    label737:
    for (;;)
    {
      int m = i;
      if (i > 600) {
        m = 600;
      }
      this.hO.startScroll(0, this.jJf, 0, k + j * n, m);
      this.jIL.sendMessageDelayed(b(1, 0, 0, null), m / 4);
      postInvalidate();
      break;
      j = i;
      if (k + i >= this.jIf) {
        break label341;
      }
      j = this.jIf - k;
      break label341;
      i += j * 300;
      break label403;
      k = this.jJe;
      i = (int)(300.0F * -this.jJe / this.jIZ);
      if (j < 0)
      {
        i -= j * 300;
        break label403;
      }
      i += j * 300;
      break label403;
      i += 1;
      break label243;
      paramMotionEvent = this.ez;
      paramMotionEvent.computeCurrentVelocity(1000);
      i = (int)(paramMotionEvent.getYVelocity() * this.jIu);
      if (Math.abs(i) > this.jIo)
      {
        this.hO.a(this.jJf, 0, -i, Integer.MIN_VALUE, Integer.MAX_VALUE, kl(Integer.MIN_VALUE), kl(Integer.MAX_VALUE));
        invalidate();
        kj(2);
      }
      this.jIL.sendMessageDelayed(b(1, 0, 0, null), 0L);
      if (this.ez == null) {
        break;
      }
      this.ez.clear();
      this.ez.recycle();
      this.ez = null;
      break;
      this.jIT = this.jJf;
      adr();
      this.jIL.sendMessageDelayed(b(1, 0, 0, null), 0L);
      break;
    }
  }
  
  public void postInvalidate()
  {
    GMTrace.i(17642651910144L, 131448);
    if (!z.al(this))
    {
      GMTrace.o(17642651910144L, 131448);
      return;
    }
    super.postInvalidate();
    GMTrace.o(17642651910144L, 131448);
  }
  
  public final void setDisplayedValues(String[] paramArrayOfString)
  {
    boolean bool = true;
    GMTrace.i(17643188781056L, 131452);
    if (this.jIL != null) {
      this.jIL.removeMessages(1);
    }
    adr();
    if (paramArrayOfString == null) {
      throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }
    if (this.jIi - this.jIh + 1 > paramArrayOfString.length) {
      throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + (this.jIi - this.jIh + 1) + " newDisplayedValues.length is " + paramArrayOfString.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
    }
    this.jII = paramArrayOfString;
    adq();
    cX(true);
    this.jIn = (this.jIf + 0);
    if ((this.jIz) && (this.jIB)) {}
    for (;;)
    {
      v(0, bool);
      postInvalidate();
      this.jIM.sendEmptyMessage(3);
      GMTrace.o(17643188781056L, 131452);
      return;
      bool = false;
    }
  }
  
  public final void setDividerHeight(int paramInt)
  {
    GMTrace.i(17643725651968L, 131456);
    if (paramInt == this.Ri)
    {
      GMTrace.o(17643725651968L, 131456);
      return;
    }
    this.Ri = paramInt;
    this.jIF.setStrokeWidth(this.Ri);
    postInvalidate();
    GMTrace.o(17643725651968L, 131456);
  }
  
  public final void setMaxValue(int paramInt)
  {
    GMTrace.i(17643322998784L, 131453);
    if (this.jII == null) {
      throw new NullPointerException("mDisplayedValues should not be null");
    }
    if (paramInt - this.jIh + 1 > this.jII.length) {
      throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + (paramInt - this.jIh + 1) + " and mDisplayedValues.length is " + this.jII.length);
    }
    this.jIi = paramInt;
    this.jIg = (this.jIi - this.jIh + this.jIf);
    g(this.jIf, this.jIg, true);
    ado();
    GMTrace.o(17643322998784L, 131453);
  }
  
  public final void setValue(int paramInt)
  {
    GMTrace.i(17643457216512L, 131454);
    if (paramInt < this.jIh) {
      throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + paramInt);
    }
    if (paramInt > this.jIi) {
      throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + paramInt);
    }
    paramInt -= this.jIh;
    int i;
    if ((this.jIf >= 0) && (this.jIf <= paramInt) && (paramInt <= this.jIg))
    {
      this.jIn = paramInt;
      i = this.jIf;
      if ((!this.jIz) || (!this.jIB)) {
        break label153;
      }
    }
    label153:
    for (boolean bool = true;; bool = false)
    {
      v(paramInt - i, bool);
      postInvalidate();
      GMTrace.o(17643457216512L, 131454);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(YANumberPicker paramYANumberPicker, int paramInt);
  }
  
  public static abstract interface b {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/YANumberPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */