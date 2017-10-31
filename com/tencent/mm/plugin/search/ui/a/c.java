package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.d.a;
import com.tencent.mm.plugin.fts.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends a
{
  public List<String> iOh;
  public CharSequence pnP;
  private b pnQ;
  a pnR;
  
  public c(int paramInt)
  {
    super(17, paramInt);
    GMTrace.i(11851828035584L, 88303);
    this.pnQ = new b();
    this.pnR = new a();
    GMTrace.o(11851828035584L, 88303);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16470394273792L, 122714);
    b localb = this.pnQ;
    GMTrace.o(16470394273792L, 122714);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18366353899520L, 136840);
    a locala = this.pnR;
    GMTrace.o(18366353899520L, 136840);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470260056064L, 122713);
    parama = new SpannableStringBuilder();
    paramVarArgs = this.iOh.iterator();
    while (paramVarArgs.hasNext())
    {
      String str = (String)paramVarArgs.next();
      SpannableString localSpannableString = new SpannableString(str);
      localSpannableString.setSpan(new ForegroundColorSpan(d.a.mmS), 0, str.length(), 33);
      parama.append(localSpannableString);
      parama.append("、");
    }
    this.pnP = TextUtils.concat(new CharSequence[] { paramContext.getString(R.l.eFh), parama.subSequence(0, parama.length() - 1), paramContext.getString(R.l.eFg) });
    GMTrace.o(16470260056064L, 122713);
  }
  
  private final class a
    extends a.a
  {
    public TextView iiN;
    
    public a()
    {
      super();
      GMTrace.i(11854512390144L, 88323);
      GMTrace.o(11854512390144L, 88323);
    }
  }
  
  private final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(11846727761920L, 88265);
      GMTrace.o(11846727761920L, 88265);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11846861979648L, 88266);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVt, paramViewGroup, false);
      paramViewGroup = (c.a)c.this.pnR;
      paramViewGroup.iiN = ((TextView)paramContext.findViewById(R.h.bAy));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11846861979648L, 88266);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16474689241088L, 122746);
      paramContext = (c.a)parama;
      e.a(c.this.pnP, paramContext.iiN);
      GMTrace.o(16474689241088L, 122746);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(16474823458816L, 122747);
      paramVarArgs = new Intent();
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(c.this.iOh);
      paramVarArgs.putExtra("query_phrase_list", localArrayList);
      paramVarArgs.putExtra("go_to_chatroom_direct", true);
      paramVarArgs.putExtra("scene_from", 3);
      d.a(paramContext, ".ui.transmit.MMCreateChatroomUI", paramVarArgs);
      GMTrace.o(16474823458816L, 122747);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */