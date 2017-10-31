package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.video.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DialPad
  extends RelativeLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static final String[] naF;
  private static final String[] naG;
  boolean naE;
  Map<Integer, DialNumberButton> naH;
  private Map<String, DialNumberButton> naI;
  Map<Integer, View> naJ;
  a naK;
  
  static
  {
    GMTrace.i(11642045726720L, 86740);
    naF = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
    naG = new String[] { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", "" };
    GMTrace.o(11642045726720L, 86740);
  }
  
  public DialPad(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11641106202624L, 86733);
    this.naE = false;
    this.naH = new HashMap();
    this.naI = new HashMap();
    this.naJ = new HashMap();
    init();
    GMTrace.o(11641106202624L, 86733);
  }
  
  private void a(int paramInt, String paramString1, String paramString2, float paramFloat)
  {
    GMTrace.i(11641374638080L, 86735);
    DialNumberButton localDialNumberButton = (DialNumberButton)findViewById(paramInt);
    if ((!bg.mZ(paramString1)) && (paramString1.length() == 1)) {
      localDialNumberButton.naC.setText(paramString1);
    }
    if ((bg.mZ(paramString2)) && (!"1".equals(paramString1))) {
      localDialNumberButton.naD.setVisibility(8);
    }
    for (;;)
    {
      localDialNumberButton.naC.setTextSize(0, paramFloat);
      localDialNumberButton.setOnClickListener(this);
      localDialNumberButton.setOnLongClickListener(this);
      localDialNumberButton.fu(this.naE);
      this.naH.put(Integer.valueOf(paramInt), localDialNumberButton);
      this.naI.put(paramString1, localDialNumberButton);
      GMTrace.o(11641374638080L, 86735);
      return;
      localDialNumberButton.naD.setText(paramString2);
      localDialNumberButton.naD.setVisibility(0);
    }
  }
  
  private void init()
  {
    GMTrace.i(11641240420352L, 86734);
    LayoutInflater.from(getContext()).inflate(R.i.bBK, this);
    float f1 = getContext().getResources().getDimensionPixelSize(R.f.aUd);
    float f2 = getContext().getResources().getDimensionPixelSize(R.f.aUf);
    float f3 = getContext().getResources().getDimensionPixelSize(R.f.aUe);
    a(R.h.bBC, naF[0], naG[0], f1);
    a(R.h.bBI, naF[1], naG[1], f1);
    a(R.h.bBH, naF[2], naG[2], f1);
    a(R.h.bBA, naF[3], naG[3], f1);
    a(R.h.bBz, naF[4], naG[4], f1);
    a(R.h.bBF, naF[5], naG[5], f1);
    a(R.h.bBD, naF[6], naG[6], f1);
    a(R.h.bBy, naF[7], naG[7], f1);
    a(R.h.bBB, naF[8], naG[8], f1);
    a(R.h.bBG, naF[9], naG[9], f3);
    a(R.h.bBJ, naF[10], naG[10], f1);
    a(R.h.bBE, naF[11], naG[11], f2);
    this.naJ.put(Integer.valueOf(R.h.bCo), findViewById(R.h.bCo));
    this.naJ.put(Integer.valueOf(R.h.bCt), findViewById(R.h.bCt));
    this.naJ.put(Integer.valueOf(R.h.bCr), findViewById(R.h.bCr));
    this.naJ.put(Integer.valueOf(R.h.bCl), findViewById(R.h.bCl));
    this.naJ.put(Integer.valueOf(R.h.bCk), findViewById(R.h.bCk));
    Iterator localIterator = this.naJ.values().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if (this.naE) {
        localView.setBackgroundDrawable(getResources().getDrawable(R.e.aQu));
      } else {
        localView.setBackgroundDrawable(getResources().getDrawable(R.e.aOc));
      }
    }
    setClipToPadding(false);
    setClipChildren(false);
    GMTrace.o(11641240420352L, 86734);
  }
  
  public void onClick(View arg1)
  {
    GMTrace.i(11641508855808L, 86736);
    String str1;
    String str2;
    d locald;
    int i;
    Object localObject2;
    if (this.naH.containsKey(Integer.valueOf(???.getId())))
    {
      ??? = (DialNumberButton)this.naH.get(Integer.valueOf(???.getId()));
      str1 = ???.aHX();
      str2 = ???.aHY();
      locald = i.aHw();
      i = d.Jb(str1);
      if ((i != -1) && (d.buf()))
      {
        localObject2 = ap.AT().gFp;
        ??? = (View)localObject2;
        if (localObject2 == null) {
          ??? = (AudioManager)d.mContext.getSystemService("audio");
        }
        int j = ???.getRingerMode();
        if ((j != 0) && (j != 1)) {
          break label167;
        }
      }
      if (this.naK != null)
      {
        localObject2 = this.naK;
        if (bg.mZ(str1)) {
          break label213;
        }
      }
    }
    label167:
    label213:
    for (??? = str1;; ??? = str2)
    {
      ((a)localObject2).zK(???);
      GMTrace.o(11641508855808L, 86736);
      return;
      synchronized (locald.rwP)
      {
        if (locald.rwQ != null) {}
      }
      locald.rwQ.startTone(i, 250);
      break;
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    GMTrace.i(11641643073536L, 86737);
    if (this.naH.containsKey(Integer.valueOf(paramView.getId())))
    {
      paramView = (DialNumberButton)this.naH.get(Integer.valueOf(paramView.getId()));
      String str = paramView.aHX();
      paramView = paramView.aHY();
      if (this.naK != null)
      {
        a locala = this.naK;
        if (!bg.mZ(str)) {
          paramView = str;
        }
        locala.zL(paramView);
      }
      GMTrace.o(11641643073536L, 86737);
      return true;
    }
    GMTrace.o(11641643073536L, 86737);
    return false;
  }
  
  public void onViewAdded(View paramView)
  {
    GMTrace.i(11641777291264L, 86738);
    w.i("MicroMsg.DialPad", "onViewAdded, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    GMTrace.o(11641777291264L, 86738);
  }
  
  public void onViewRemoved(View paramView)
  {
    GMTrace.i(11641911508992L, 86739);
    w.i("MicroMsg.DialPad", "onViewRemoved, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    GMTrace.o(11641911508992L, 86739);
  }
  
  public static abstract interface a
  {
    public abstract void zK(String paramString);
    
    public abstract void zL(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/DialPad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */