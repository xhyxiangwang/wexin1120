package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class e
{
  private final a vT;
  
  public e(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, (byte)0);
  }
  
  private e(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, byte paramByte)
  {
    if (Build.VERSION.SDK_INT > 17)
    {
      this.vT = new c(paramContext, paramOnGestureListener, null);
      return;
    }
    this.vT = new b(paramContext, paramOnGestureListener, null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.vT.onTouchEvent(paramMotionEvent);
  }
  
  static abstract interface a
  {
    public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
  }
  
  static final class b
    implements e.a
  {
    private static final int vY = ;
    private static final int vZ = ViewConfiguration.getTapTimeout();
    private static final int wa = ViewConfiguration.getDoubleTapTimeout();
    private VelocityTracker ez;
    final Handler mHandler = new a();
    private int vU;
    private int vV;
    private int vW;
    private int vX;
    public final GestureDetector.OnGestureListener wb;
    public GestureDetector.OnDoubleTapListener wc;
    public boolean wd;
    public boolean we;
    boolean wf;
    private boolean wg;
    private boolean wh;
    public MotionEvent wi;
    private MotionEvent wj;
    private boolean wk;
    private float wl;
    private float wm;
    private float wn;
    private float wo;
    private boolean wp;
    
    public b(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.wb = paramOnGestureListener;
      if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
        this.wc = ((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
      }
      if (paramContext == null) {
        throw new IllegalArgumentException("Context must not be null");
      }
      if (this.wb == null) {
        throw new IllegalArgumentException("OnGestureListener must not be null");
      }
      this.wp = true;
      paramContext = ViewConfiguration.get(paramContext);
      int i = paramContext.getScaledTouchSlop();
      int j = paramContext.getScaledDoubleTapSlop();
      this.vW = paramContext.getScaledMinimumFlingVelocity();
      this.vX = paramContext.getScaledMaximumFlingVelocity();
      this.vU = (i * i);
      this.vV = (j * j);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i1 = paramMotionEvent.getAction();
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      int i;
      if ((i1 & 0xFF) == 6)
      {
        i = 1;
        if (i == 0) {
          break label127;
        }
      }
      int n;
      int m;
      float f1;
      float f2;
      float f4;
      float f3;
      label127:
      for (int k = o.e(paramMotionEvent);; k = -1)
      {
        n = o.f(paramMotionEvent);
        m = 0;
        f1 = 0.0F;
        for (f2 = 0.0F; m < n; f2 = f3)
        {
          f4 = f1;
          f3 = f2;
          if (k != m)
          {
            f3 = f2 + o.d(paramMotionEvent, m);
            f4 = f1 + o.e(paramMotionEvent, m);
          }
          m += 1;
          f1 = f4;
        }
        i = 0;
        break;
      }
      if (i != 0)
      {
        i = n - 1;
        f2 /= i;
        f1 /= i;
      }
      boolean bool2;
      MotionEvent localMotionEvent;
      Object localObject;
      label757:
      int j;
      switch (i1 & 0xFF)
      {
      case 4: 
      default: 
      case 5: 
      case 6: 
      case 0: 
      case 2: 
        do
        {
          do
          {
            return false;
            i = n;
            break;
            this.wl = f2;
            this.wn = f2;
            this.wm = f1;
            this.wo = f1;
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.wk = false;
            this.wg = false;
            this.wh = false;
            this.we = false;
          } while (!this.wf);
          this.wf = false;
          return false;
          this.wl = f2;
          this.wn = f2;
          this.wm = f1;
          this.wo = f1;
          this.ez.computeCurrentVelocity(1000, this.vX);
          k = o.e(paramMotionEvent);
          i = o.c(paramMotionEvent, k);
          f1 = y.a(this.ez, i);
          f2 = y.b(this.ez, i);
          i = 0;
          while (i < n)
          {
            if (i != k)
            {
              m = o.c(paramMotionEvent, i);
              f3 = y.a(this.ez, m);
              if (y.b(this.ez, m) * f2 + f3 * f1 < 0.0F)
              {
                this.ez.clear();
                return false;
              }
            }
            i += 1;
          }
          if (this.wc != null)
          {
            bool2 = this.mHandler.hasMessages(3);
            if (bool2) {
              this.mHandler.removeMessages(3);
            }
            if ((this.wi != null) && (this.wj != null) && (bool2))
            {
              localMotionEvent = this.wi;
              localObject = this.wj;
              if ((this.wh) && (paramMotionEvent.getEventTime() - ((MotionEvent)localObject).getEventTime() <= wa))
              {
                i = (int)localMotionEvent.getX() - (int)paramMotionEvent.getX();
                k = (int)localMotionEvent.getY() - (int)paramMotionEvent.getY();
                if (k * k + i * i < this.vV)
                {
                  i = 1;
                  if (i == 0) {
                    break label757;
                  }
                  this.wk = true;
                }
              }
            }
          }
          for (boolean bool1 = this.wc.onDoubleTap(this.wi) | false | this.wc.onDoubleTapEvent(paramMotionEvent);; bool1 = false)
          {
            this.wl = f2;
            this.wn = f2;
            this.wm = f1;
            this.wo = f1;
            if (this.wi != null) {
              this.wi.recycle();
            }
            this.wi = MotionEvent.obtain(paramMotionEvent);
            this.wg = true;
            this.wh = true;
            this.wd = true;
            this.wf = false;
            this.we = false;
            if (this.wp)
            {
              this.mHandler.removeMessages(2);
              this.mHandler.sendEmptyMessageAtTime(2, this.wi.getDownTime() + vZ + vY);
            }
            this.mHandler.sendEmptyMessageAtTime(1, this.wi.getDownTime() + vZ);
            return bool1 | this.wb.onDown(paramMotionEvent);
            bool1 = false;
            break;
            this.mHandler.sendEmptyMessageDelayed(3, wa);
          }
        } while (this.wf);
        f3 = this.wl - f2;
        f4 = this.wm - f1;
        if (this.wk) {
          return this.wc.onDoubleTapEvent(paramMotionEvent) | false;
        }
        if (this.wg)
        {
          j = (int)(f2 - this.wn);
          k = (int)(f1 - this.wo);
          j = j * j + k * k;
          if (j <= this.vU) {
            break label1350;
          }
          bool2 = this.wb.onScroll(this.wi, paramMotionEvent, f3, f4);
          this.wl = f2;
          this.wm = f1;
          this.wg = false;
          this.mHandler.removeMessages(3);
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
        }
        break;
      }
      for (;;)
      {
        if (j > this.vU) {
          this.wh = false;
        }
        return bool2;
        if ((Math.abs(f3) < 1.0F) && (Math.abs(f4) < 1.0F)) {
          break;
        }
        bool2 = this.wb.onScroll(this.wi, paramMotionEvent, f3, f4);
        this.wl = f2;
        this.wm = f1;
        return bool2;
        this.wd = false;
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if (this.wk) {
          bool2 = this.wc.onDoubleTapEvent(paramMotionEvent) | false;
        }
        for (;;)
        {
          if (this.wj != null) {
            this.wj.recycle();
          }
          this.wj = localMotionEvent;
          if (this.ez != null)
          {
            this.ez.recycle();
            this.ez = null;
          }
          this.wk = false;
          this.we = false;
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
          return bool2;
          if (this.wf)
          {
            this.mHandler.removeMessages(3);
            this.wf = false;
            bool2 = false;
          }
          else if (this.wg)
          {
            boolean bool3 = this.wb.onSingleTapUp(paramMotionEvent);
            bool2 = bool3;
            if (this.we)
            {
              bool2 = bool3;
              if (this.wc != null)
              {
                this.wc.onSingleTapConfirmed(paramMotionEvent);
                bool2 = bool3;
              }
            }
          }
          else
          {
            localObject = this.ez;
            j = o.c(paramMotionEvent, 0);
            ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.vX);
            f1 = y.b((VelocityTracker)localObject, j);
            f2 = y.a((VelocityTracker)localObject, j);
            if ((Math.abs(f1) > this.vW) || (Math.abs(f2) > this.vW))
            {
              bool2 = this.wb.onFling(this.wi, paramMotionEvent, f2, f1);
              continue;
              this.mHandler.removeMessages(1);
              this.mHandler.removeMessages(2);
              this.mHandler.removeMessages(3);
              this.ez.recycle();
              this.ez = null;
              this.wk = false;
              this.wd = false;
              this.wg = false;
              this.wh = false;
              this.we = false;
              if (!this.wf) {
                break;
              }
              this.wf = false;
              return false;
            }
            bool2 = false;
          }
        }
        label1350:
        bool2 = false;
      }
    }
    
    private final class a
      extends Handler
    {
      a() {}
      
      public final void handleMessage(Message paramMessage)
      {
        switch (paramMessage.what)
        {
        default: 
          throw new RuntimeException("Unknown message " + paramMessage);
        case 1: 
          e.b.this.wb.onShowPress(e.b.this.wi);
        }
        do
        {
          return;
          paramMessage = e.b.this;
          paramMessage.mHandler.removeMessages(3);
          paramMessage.we = false;
          paramMessage.wf = true;
          paramMessage.wb.onLongPress(paramMessage.wi);
          return;
        } while (e.b.this.wc == null);
        if (!e.b.this.wd)
        {
          e.b.this.wc.onSingleTapConfirmed(e.b.this.wi);
          return;
        }
        e.b.this.we = true;
      }
    }
  }
  
  static final class c
    implements e.a
  {
    private final GestureDetector wr;
    
    public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.wr = new GestureDetector(paramContext, paramOnGestureListener, null);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return this.wr.onTouchEvent(paramMotionEvent);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */