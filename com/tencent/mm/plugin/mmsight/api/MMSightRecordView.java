package com.tencent.mm.plugin.mmsight.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;

public class MMSightRecordView
  extends FrameLayout
{
  public static b nKq;
  public d nKp;
  
  public MMSightRecordView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20197620580352L, 150484);
    init(paramContext);
    GMTrace.o(20197620580352L, 150484);
  }
  
  public MMSightRecordView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20197486362624L, 150483);
    init(paramContext);
    GMTrace.o(20197486362624L, 150483);
  }
  
  public MMSightRecordView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20197352144896L, 150482);
    init(paramContext);
    GMTrace.o(20197352144896L, 150482);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20197754798080L, 150485);
    this.nKp = nKq.Rd();
    this.nKp.b(paramContext, this);
    GMTrace.o(20197754798080L, 150485);
  }
  
  public final void M(float paramFloat)
  {
    GMTrace.i(20197889015808L, 150486);
    this.nKp.M(paramFloat);
    GMTrace.o(20197889015808L, 150486);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(20198694322176L, 150492);
    this.nKp.a(parama);
    GMTrace.o(20198694322176L, 150492);
  }
  
  public final void a(e parame, boolean paramBoolean)
  {
    GMTrace.i(20198560104448L, 150491);
    this.nKp.a(parame, paramBoolean);
    GMTrace.o(20198560104448L, 150491);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(20198425886720L, 150490);
    this.nKp.a(paramf);
    GMTrace.o(20198425886720L, 150490);
  }
  
  public final void aNO()
  {
    GMTrace.i(20198828539904L, 150493);
    this.nKp.bQ(true);
    GMTrace.o(20198828539904L, 150493);
  }
  
  public final void aNP()
  {
    GMTrace.i(20198962757632L, 150494);
    this.nKp.bR(true);
    GMTrace.o(20198962757632L, 150494);
  }
  
  public final void hG(int paramInt)
  {
    GMTrace.i(20198023233536L, 150487);
    this.nKp.hG(paramInt);
    GMTrace.o(20198023233536L, 150487);
  }
  
  public final void hH(int paramInt)
  {
    GMTrace.i(20199096975360L, 150495);
    this.nKp.hH(paramInt);
    GMTrace.o(20199096975360L, 150495);
  }
  
  public final void nu(String paramString)
  {
    GMTrace.i(20198291668992L, 150489);
    this.nKp.nu(paramString);
    GMTrace.o(20198291668992L, 150489);
  }
  
  public final void qw(int paramInt)
  {
    GMTrace.i(20198157451264L, 150488);
    this.nKp.f(paramInt, 4800000, 30, 64000, 44100);
    GMTrace.o(20198157451264L, 150488);
  }
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract MMSightRecordView.d Rd();
  }
  
  public static abstract interface c
  {
    public abstract void Wx();
  }
  
  public static abstract class d
  {
    public d()
    {
      GMTrace.i(20199499628544L, 150498);
      GMTrace.o(20199499628544L, 150498);
    }
    
    public abstract void M(float paramFloat);
    
    public abstract String Re();
    
    public abstract void Rf();
    
    public abstract Point Rh();
    
    public abstract Point Ri();
    
    public abstract void Rj();
    
    public abstract int Rn();
    
    public abstract void Ro();
    
    public abstract void Rp();
    
    public abstract void a(MMSightRecordView.a parama);
    
    public abstract void a(MMSightRecordView.c paramc);
    
    public abstract void a(MMSightRecordView.e parame, boolean paramBoolean);
    
    public abstract void a(MMSightRecordView.f paramf);
    
    public abstract void b(Context paramContext, ViewGroup paramViewGroup);
    
    public abstract void bP(boolean paramBoolean);
    
    public abstract void bQ(boolean paramBoolean);
    
    public abstract void bR(boolean paramBoolean);
    
    public abstract void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract void hG(int paramInt);
    
    public abstract void hH(int paramInt);
    
    public abstract void nu(String paramString);
    
    public abstract boolean qA();
    
    public abstract void release();
    
    public abstract void startPreview();
  }
  
  public static abstract interface e
  {
    public abstract void Ww();
    
    public abstract void r(Bitmap paramBitmap);
  }
  
  public static abstract interface f
  {
    public abstract void ce(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/api/MMSightRecordView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */