package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends BaseAdapter
{
  List<b> kmN;
  View.OnClickListener kze;
  boolean kzf;
  private Context mContext;
  
  public l(Context paramContext)
  {
    GMTrace.i(4972632604672L, 37049);
    this.kmN = new ArrayList();
    this.kzf = false;
    this.mContext = paramContext;
    GMTrace.o(4972632604672L, 37049);
  }
  
  private static void a(View paramView, b paramb)
  {
    GMTrace.i(4973303693312L, 37054);
    if (paramb == null)
    {
      GMTrace.o(4973303693312L, 37054);
      return;
    }
    j(paramView, paramb.knE);
    GMTrace.o(4973303693312L, 37054);
  }
  
  private static void j(View paramView, boolean paramBoolean)
  {
    GMTrace.i(4973437911040L, 37055);
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean) {
      paramView.setBackgroundResource(R.g.baH);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      paramView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      GMTrace.o(4973437911040L, 37055);
      return;
      paramView.setBackgroundResource(R.g.aZN);
    }
  }
  
  private b lK(int paramInt)
  {
    GMTrace.i(4972901040128L, 37051);
    b localb = (b)this.kmN.get(paramInt);
    GMTrace.o(4972901040128L, 37051);
    return localb;
  }
  
  public final int getCount()
  {
    GMTrace.i(4972766822400L, 37050);
    int i = this.kmN.size();
    GMTrace.o(4972766822400L, 37050);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4973035257856L, 37052);
    long l = paramInt;
    GMTrace.o(4973035257856L, 37052);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4973169475584L, 37053);
    final b localb = lK(paramInt);
    switch (localb.knD)
    {
    default: 
      if (paramView == null) {
        break;
      }
    }
    for (paramViewGroup = (a)paramView.getTag();; paramViewGroup = null)
    {
      Object localObject;
      if (paramView != null)
      {
        localObject = paramViewGroup;
        if (paramViewGroup != null) {}
      }
      else
      {
        paramView = View.inflate(this.mContext, R.i.cNQ, null);
        localObject = new a();
        ((a)localObject).kym = ((TextView)paramView.findViewById(R.h.bpc));
        ((a)localObject).kzk = ((TextView)paramView.findViewById(R.h.bpb));
        ((a)localObject).kzl = ((TextView)paramView.findViewById(R.h.boY));
        ((a)localObject).kzm = ((ImageView)paramView.findViewById(R.h.bpa));
        ((a)localObject).jSz = paramView.findViewById(R.h.boX);
        ((a)localObject).kzn = ((CheckBox)paramView.findViewById(R.h.boZ));
        paramView.setTag(localObject);
      }
      ((a)localObject).kym.setText(localb.title);
      label259:
      int i;
      if (localb.knF)
      {
        ((a)localObject).kzn.setVisibility(0);
        ((a)localObject).kzn.setChecked(localb.knG);
        ((a)localObject).kzn.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(4960418791424L, 36958);
            if (((CheckBox)paramAnonymousView).isChecked())
            {
              localb.knG = true;
              GMTrace.o(4960418791424L, 36958);
              return;
            }
            localb.knG = false;
            GMTrace.o(4960418791424L, 36958);
          }
        });
        if (!TextUtils.isEmpty(localb.kns)) {
          break label624;
        }
        ((a)localObject).kzk.setVisibility(4);
        if ((localb.tFX & 1L) <= 0L) {
          break label649;
        }
        i = 1;
        label274:
        if (i == 0) {
          break label655;
        }
        ((a)localObject).kym.setGravity(17);
        ((a)localObject).kym.setTextColor(this.mContext.getResources().getColor(R.e.aOU));
        ((a)localObject).kzk.setVisibility(8);
        label320:
        if (!localb.knE) {
          break label688;
        }
        ((a)localObject).kzl.setVisibility(0);
        label337:
        ((a)localObject).kzk.setTextColor(this.mContext.getResources().getColor(R.e.aOM));
        if (bg.mZ(localb.oqo)) {
          break label701;
        }
        i = 1;
        label372:
        if (i == 0) {
          break label707;
        }
        ((a)localObject).kzm.setVisibility(0);
        m.a(((a)localObject).kzm, localb.oqo, a.fromDPToPix(this.mContext, 20), R.g.baR, false);
        label412:
        if (paramInt + 1 >= getCount()) {
          break label720;
        }
        paramViewGroup = lK(paramInt);
        a(((a)localObject).jSz, paramViewGroup);
        paramViewGroup = lK(paramInt + 1);
        a(((a)localObject).jSz, paramViewGroup);
      }
      for (;;)
      {
        GMTrace.o(4973169475584L, 37053);
        return paramView;
        paramView = View.inflate(this.mContext, R.i.cNP, null);
        paramViewGroup = (TextView)paramView.findViewById(R.h.bpf);
        localObject = (TextView)paramView.findViewById(R.h.bpe);
        LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(R.h.cxQ);
        if (!TextUtils.isEmpty(localb.knH))
        {
          localLinearLayout.setTag(localb.knH);
          localLinearLayout.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(5027930308608L, 37461);
              paramAnonymousView = (String)paramAnonymousView.getTag();
              if (!TextUtils.isEmpty(paramAnonymousView))
              {
                if (!paramAnonymousView.contains(";")) {
                  break label104;
                }
                paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.indexOf(";"));
              }
              label104:
              for (;;)
              {
                h.a(l.a(l.this), true, paramAnonymousView, "", l.a(l.this).getString(R.l.dMr), l.a(l.this).getString(R.l.duP), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(4975316959232L, 37069);
                    paramAnonymous2DialogInterface = new Intent("android.intent.action.DIAL");
                    paramAnonymous2DialogInterface.setFlags(268435456);
                    paramAnonymous2DialogInterface.setData(Uri.parse("tel:" + paramAnonymousView));
                    l.a(l.this).startActivity(paramAnonymous2DialogInterface);
                    GMTrace.o(4975316959232L, 37069);
                  }
                }, null);
                GMTrace.o(5027930308608L, 37461);
                return;
              }
            }
          });
          ((ImageView)paramView.findViewById(R.h.bpd)).setBackgroundColor(com.tencent.mm.plugin.card.b.l.uk(localb.hbA));
          localLinearLayout.setVisibility(0);
        }
        for (;;)
        {
          paramViewGroup.setText(localb.title);
          ((TextView)localObject).setText(localb.kns);
          GMTrace.o(4973169475584L, 37053);
          return paramView;
          localLinearLayout.setVisibility(8);
        }
        ((a)localObject).kzn.setVisibility(8);
        break;
        label624:
        ((a)localObject).kzk.setVisibility(0);
        ((a)localObject).kzk.setText(localb.kns);
        break label259;
        label649:
        i = 0;
        break label274;
        label655:
        ((a)localObject).kym.setGravity(3);
        ((a)localObject).kym.setTextColor(this.mContext.getResources().getColor(R.e.aON));
        break label320;
        label688:
        ((a)localObject).kzl.setVisibility(8);
        break label337;
        label701:
        i = 0;
        break label372;
        label707:
        ((a)localObject).kzm.setVisibility(8);
        break label412;
        label720:
        if (paramInt + 1 == getCount()) {
          if (this.kzf) {
            j(((a)localObject).jSz, true);
          } else {
            j(((a)localObject).jSz, false);
          }
        }
      }
    }
  }
  
  private final class a
  {
    View jSz;
    TextView kym;
    TextView kzk;
    TextView kzl;
    ImageView kzm;
    CheckBox kzn;
    
    public a()
    {
      GMTrace.i(4926998577152L, 36709);
      GMTrace.o(4926998577152L, 36709);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */