package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;

public final class s
  extends BaseAdapter
{
  private Context context;
  private String fum;
  private LinkedList<a> hdL;
  
  public s(Context paramContext)
  {
    GMTrace.i(12678072369152L, 94459);
    this.fum = "";
    this.hdL = new LinkedList();
    this.context = paramContext;
    GMTrace.o(12678072369152L, 94459);
  }
  
  public final void a(String paramString1, String paramString2, LinkedList<ud> paramLinkedList)
  {
    GMTrace.i(12678743457792L, 94464);
    if (bg.bX(paramLinkedList))
    {
      GMTrace.o(12678743457792L, 94464);
      return;
    }
    this.fum = paramString1;
    this.hdL.clear();
    a locala;
    if (bg.mZ(paramString1))
    {
      locala = new a();
      locala.type = 1;
      if (!bg.mZ(paramString2))
      {
        locala.text = paramString2;
        this.hdL.add(locala);
      }
    }
    else
    {
      paramString2 = paramLinkedList.iterator();
      label86:
      if (!paramString2.hasNext()) {
        break label213;
      }
      paramLinkedList = (ud)paramString2.next();
      locala = new a();
      if (!bg.mZ(paramString1)) {
        break label207;
      }
    }
    label207:
    for (int i = 2;; i = 3)
    {
      locala.type = i;
      locala.appId = paramLinkedList.mCH;
      locala.text = paramLinkedList.tSj;
      locala.description = paramLinkedList.txe;
      locala.actionType = paramLinkedList.tSa;
      locala.mPM = paramLinkedList.tSb;
      this.hdL.add(locala);
      break label86;
      locala.text = this.context.getString(R.l.bNu);
      break;
    }
    label213:
    notifyDataSetChanged();
    GMTrace.o(12678743457792L, 94464);
  }
  
  public final int getCount()
  {
    GMTrace.i(12678340804608L, 94461);
    int i = this.hdL.size();
    GMTrace.o(12678340804608L, 94461);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12678609240064L, 94463);
    long l = paramInt;
    GMTrace.o(12678609240064L, 94463);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12678206586880L, 94460);
    Object localObject = oK(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.cXc, null);
      paramViewGroup = new b();
      paramViewGroup.jaE = ((TextView)paramView.findViewById(R.h.bNu));
      paramViewGroup.mPN = ((ViewGroup)paramViewGroup.jaE.getParent());
      paramViewGroup.mPO = ((TextView)paramView.findViewById(R.h.bNt));
      paramViewGroup.mPP = ((TextView)paramView.findViewById(R.h.bNr));
      paramViewGroup.mPQ = ((ViewGroup)paramViewGroup.mPO.getParent());
      paramViewGroup.mPR = ((TextView)paramView.findViewById(R.h.bNs));
      paramViewGroup.mPS = ((ViewGroup)paramViewGroup.mPR.getParent().getParent());
      paramView.setTag(paramViewGroup);
      switch (((a)localObject).type)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(12678206586880L, 94460);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.mPN.setVisibility(0);
      paramViewGroup.mPQ.setVisibility(8);
      paramViewGroup.mPS.setVisibility(8);
      paramViewGroup.mPN.setOnClickListener(null);
      paramViewGroup.jaE.setText(((a)localObject).text);
      continue;
      paramViewGroup.mPN.setVisibility(8);
      paramViewGroup.mPQ.setVisibility(0);
      paramViewGroup.mPS.setVisibility(8);
      paramViewGroup.mPO.setText(((a)localObject).text);
      paramViewGroup.mPP.setText(((a)localObject).description);
      continue;
      paramViewGroup.mPN.setVisibility(8);
      paramViewGroup.mPQ.setVisibility(8);
      paramViewGroup.mPS.setVisibility(0);
      paramInt = this.context.getResources().getColor(R.e.aPH);
      paramViewGroup.mPR.setTextColor(paramInt);
      paramInt = this.context.getResources().getColor(R.e.aOv);
      int i = ((a)localObject).text.indexOf(this.fum);
      if (i >= 0)
      {
        localObject = new SpannableString(((a)localObject).text);
        ((Spannable)localObject).setSpan(new ForegroundColorSpan(paramInt), i, this.fum.length() + i, 33);
        paramViewGroup.mPR.setText((CharSequence)localObject);
      }
      else
      {
        paramViewGroup.mPR.setText(((a)localObject).text);
      }
    }
  }
  
  public final a oK(int paramInt)
  {
    GMTrace.i(12678475022336L, 94462);
    a locala = (a)this.hdL.get(paramInt);
    GMTrace.o(12678475022336L, 94462);
    return locala;
  }
  
  public static final class a
  {
    public int actionType;
    public String appId;
    public String description;
    public String mPM;
    public String text;
    public int type;
    
    public a()
    {
      GMTrace.i(12701560471552L, 94634);
      GMTrace.o(12701560471552L, 94634);
    }
  }
  
  private static final class b
  {
    TextView jaE;
    ViewGroup mPN;
    TextView mPO;
    TextView mPP;
    ViewGroup mPQ;
    TextView mPR;
    ViewGroup mPS;
    
    public b()
    {
      GMTrace.i(12773635391488L, 95171);
      GMTrace.o(12773635391488L, 95171);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */