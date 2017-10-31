package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.AuthorizeItemListView;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.plugin.appbrand.widget.c.a
{
  private final String iTg;
  private final String iTh;
  private AuthorizeItemListView jyL;
  private b jyM;
  private LinearLayout jyN;
  private Context mContext;
  
  public c(Context paramContext, final LinkedList<ayd> paramLinkedList, String paramString1, String paramString2, final a parama)
  {
    super(paramContext, (byte)0);
    GMTrace.i(18247034339328L, 135951);
    this.mContext = paramContext;
    this.iTg = bg.mY(paramString1);
    this.iTh = paramString2;
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
      throw new IllegalArgumentException("scopeInfoList is empty or null");
    }
    paramContext = (ViewGroup)v.fa(this.mContext).inflate(p.g.iuV, null);
    setContentView(paramContext);
    paramString1 = (ImageView)paramContext.findViewById(p.f.bin);
    b.CT().a(paramString1, this.iTh, com.tencent.mm.modelappbrand.a.a.CS(), e.hkj);
    ((TextView)paramContext.findViewById(p.f.bit)).setText(this.mContext.getString(p.i.ekL, new Object[] { this.iTg }));
    this.jyL = ((AuthorizeItemListView)paramContext.findViewById(p.f.bjg));
    this.jyM = new b(paramLinkedList);
    this.jyL.setAdapter(this.jyM);
    if (paramLinkedList.size() > 5)
    {
      this.jyL.Oh = paramLinkedList.size();
      this.jyN = ((LinearLayout)paramContext.findViewById(p.f.bjh));
      paramString1 = (LinearLayout.LayoutParams)this.jyN.getLayoutParams();
      paramString1.height = this.mContext.getResources().getDimensionPixelSize(p.d.aUj);
      this.jyN.setLayoutParams(paramString1);
    }
    ((Button)paramContext.findViewById(p.f.bUT)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10031567208448L, 74741);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((ayd)paramLinkedList.get(i)).uss == 2) || (((ayd)paramLinkedList.get(i)).uss == 3)) {
            paramAnonymousView.add(((ayd)paramLinkedList.get(i)).tBX);
          }
          i += 1;
        }
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(1, localBundle);
        jdField_this.dismiss();
        GMTrace.o(10031567208448L, 74741);
      }
    });
    ((Button)paramContext.findViewById(p.f.bVb)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10139209826304L, 75543);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((ayd)paramLinkedList.get(i)).uss == 2) || (((ayd)paramLinkedList.get(i)).uss == 3)) {
            paramAnonymousView.add(((ayd)paramLinkedList.get(i)).tBX);
          }
          i += 1;
        }
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(2, localBundle);
        jdField_this.dismiss();
        GMTrace.o(10139209826304L, 75543);
      }
    });
    setCanceledOnTouchOutside(false);
    setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18290386665472L, 136274);
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        parama.c(3, null);
        GMTrace.o(18290386665472L, 136274);
      }
    });
    GMTrace.o(18247034339328L, 135951);
  }
  
  public static abstract interface a
  {
    public abstract void c(int paramInt, Bundle paramBundle);
  }
  
  private static final class b
    extends BaseAdapter
  {
    private LinkedList<ayd> jyR;
    
    b(LinkedList<ayd> paramLinkedList)
    {
      GMTrace.i(18296560680960L, 136320);
      this.jyR = paramLinkedList;
      GMTrace.o(18296560680960L, 136320);
    }
    
    private ayd jJ(int paramInt)
    {
      GMTrace.i(10046331158528L, 74851);
      ayd localayd = (ayd)this.jyR.get(paramInt);
      GMTrace.o(10046331158528L, 74851);
      return localayd;
    }
    
    public final int getCount()
    {
      GMTrace.i(10046196940800L, 74850);
      if (this.jyR == null)
      {
        GMTrace.o(10046196940800L, 74850);
        return 0;
      }
      int i = this.jyR.size();
      GMTrace.o(10046196940800L, 74850);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(10046465376256L, 74852);
      long l = paramInt;
      GMTrace.o(10046465376256L, 74852);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(10046599593984L, 74853);
      if ((this.jyR == null) || (this.jyR.size() <= 0))
      {
        GMTrace.o(10046599593984L, 74853);
        return null;
      }
      final ayd localayd = jJ(paramInt);
      final Object localObject;
      if (paramView == null)
      {
        paramView = new a();
        localObject = View.inflate(paramViewGroup.getContext(), p.g.cMH, null);
        paramView.jyV = ((ImageView)((View)localObject).findViewById(p.f.bid));
        paramView.jyW = ((TextView)((View)localObject).findViewById(p.f.bic));
        ((View)localObject).setTag(paramView);
        paramViewGroup = paramView;
        paramView = (View)localObject;
        if (localayd.uss != 1) {
          break label185;
        }
        paramViewGroup.jyV.setImageResource(p.h.doP);
      }
      for (;;)
      {
        paramViewGroup.jyW.setText(localayd.mCK);
        localObject = paramViewGroup.jyV;
        paramViewGroup.jyV.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(10045123198976L, 74842);
            if (localayd.uss == 2)
            {
              localObject.setImageResource(p.h.doP);
              localayd.uss = 1;
              GMTrace.o(10045123198976L, 74842);
              return;
            }
            if (localayd.uss == 1)
            {
              localObject.setImageResource(p.h.doN);
              localayd.uss = 2;
            }
            GMTrace.o(10045123198976L, 74842);
          }
        });
        GMTrace.o(10046599593984L, 74853);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label185:
        if (localayd.uss == 3) {
          paramViewGroup.jyV.setImageResource(p.h.doO);
        } else {
          paramViewGroup.jyV.setImageResource(p.h.doN);
        }
      }
    }
    
    private static final class a
    {
      ImageView jyV;
      TextView jyW;
      
      public a()
      {
        GMTrace.i(18246900121600L, 135950);
        GMTrace.o(18246900121600L, 135950);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */