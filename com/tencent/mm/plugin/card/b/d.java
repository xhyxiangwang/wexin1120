package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;

public final class d
{
  public static void a(MMActivity paramMMActivity, b paramb)
  {
    GMTrace.i(5051955281920L, 37640);
    h.a(paramMMActivity, true, paramMMActivity.getString(R.l.dES), "", paramMMActivity.getString(R.l.dwr), paramMMActivity.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5047257661440L, 37605);
        paramAnonymousDialogInterface.dismiss();
        this.kAL.alg();
        GMTrace.o(5047257661440L, 37605);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5056518684672L, 37674);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(5056518684672L, 37674);
      }
    });
    GMTrace.o(5051955281920L, 37640);
  }
  
  public static void a(MMActivity paramMMActivity, final String paramString1, String paramString2, b paramb)
  {
    GMTrace.i(5051821064192L, 37639);
    if (!TextUtils.isEmpty(paramString2)) {}
    for (;;)
    {
      h.a(paramMMActivity, true, paramString2, paramMMActivity.getString(R.l.dxm), paramMMActivity.getString(R.l.dwr), paramMMActivity.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5054639636480L, 37660);
          paramAnonymousDialogInterface.dismiss();
          this.kAL.aio();
          GMTrace.o(5054639636480L, 37660);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5051418411008L, 37636);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(5051418411008L, 37636);
        }
      });
      GMTrace.o(5051821064192L, 37639);
      return;
      paramString2 = paramMMActivity.getString(R.l.duZ);
    }
  }
  
  public static void a(final MMActivity paramMMActivity, String paramString, boolean paramBoolean)
  {
    GMTrace.i(5052357935104L, 37643);
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = paramMMActivity.getString(R.l.eZz);
    }
    h.a(paramMMActivity, str, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5051149975552L, 37634);
        paramAnonymousDialogInterface.dismiss();
        if (this.kAM) {
          paramMMActivity.finish();
        }
        GMTrace.o(5051149975552L, 37634);
      }
    });
    GMTrace.o(5052357935104L, 37643);
  }
  
  public static void b(MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(5052089499648L, 37641);
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = paramMMActivity.getString(R.l.eZz);
    }
    a(paramMMActivity, str, false);
    GMTrace.o(5052089499648L, 37641);
  }
  
  public static void b(MMActivity paramMMActivity, String paramString, int paramInt)
  {
    GMTrace.i(5052223717376L, 37642);
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "errcode = " + paramInt;
    }
    a(paramMMActivity, str, false);
    GMTrace.o(5052223717376L, 37642);
  }
  
  public static void c(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5052492152832L, 37644);
    if (paramInt1 == -1)
    {
      GMTrace.o(5052492152832L, 37644);
      return;
    }
    String str1;
    if (paramInt1 == R.i.cOK)
    {
      str2 = paramContext.getResources().getString(paramInt2);
      str3 = paramContext.getResources().getString(R.l.eDF);
      localObject1 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5046855008256L, 37602);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(5046855008256L, 37602);
        }
      };
      localObject2 = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt1, null);
      if (paramInt1 == R.i.cOJ)
      {
        localObject3 = (TextView)((View)localObject2).findViewById(R.h.brf);
        str1 = paramString;
        if (TextUtils.isEmpty(paramString)) {
          str1 = paramContext.getResources().getString(R.l.cOa);
        }
        ((TextView)localObject3).setText(paramContext.getResources().getString(R.l.dEH, new Object[] { str1 }));
      }
      for (;;)
      {
        paramContext = h.a(paramContext, str2, str3, (View)localObject2, (DialogInterface.OnClickListener)localObject1);
        if (paramContext != null) {
          paramContext.show();
        }
        GMTrace.o(5052492152832L, 37644);
        return;
        if (paramInt1 == R.i.cOI)
        {
          localObject3 = (TextView)((View)localObject2).findViewById(R.h.brf);
          str1 = paramString;
          if (TextUtils.isEmpty(paramString)) {
            str1 = paramContext.getResources().getString(R.l.cOa);
          }
          ((TextView)localObject3).setText(paramContext.getResources().getString(R.l.dEG, new Object[] { str1 }));
        }
      }
    }
    String str2 = paramContext.getResources().getString(paramInt2);
    String str3 = paramContext.getResources().getString(R.l.dFy);
    Object localObject1 = paramContext.getResources().getString(R.l.eDF);
    Object localObject2 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5038265073664L, 37538);
        paramAnonymousDialogInterface.dismiss();
        paramAnonymousDialogInterface = new Intent();
        paramAnonymousDialogInterface.putExtra("key_from_scene", 22);
        paramAnonymousDialogInterface.putExtra("key_home_page_from_scene", 1);
        com.tencent.mm.bi.d.b(this.val$context, "card", ".ui.CardHomePageUI", paramAnonymousDialogInterface);
        GMTrace.o(5038265073664L, 37538);
      }
    };
    Object localObject3 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5050881540096L, 37632);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(5050881540096L, 37632);
      }
    };
    View localView = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt1, null);
    TextView localTextView;
    if (paramInt1 == R.i.cOJ)
    {
      localTextView = (TextView)localView.findViewById(R.h.brf);
      str1 = paramString;
      if (TextUtils.isEmpty(paramString)) {
        str1 = paramContext.getResources().getString(R.l.cOa);
      }
      localTextView.setText(paramContext.getResources().getString(R.l.dEH, new Object[] { str1 }));
    }
    for (;;)
    {
      paramContext = h.a(paramContext, str2, localView, str3, (String)localObject1, (DialogInterface.OnClickListener)localObject2, (DialogInterface.OnClickListener)localObject3);
      break;
      if (paramInt1 == R.i.cOI)
      {
        localTextView = (TextView)localView.findViewById(R.h.brf);
        str1 = paramString;
        if (TextUtils.isEmpty(paramString)) {
          str1 = paramContext.getResources().getString(R.l.cOa);
        }
        localTextView.setText(paramContext.getResources().getString(R.l.dEG, new Object[] { str1 }));
      }
    }
  }
  
  public static class a
    implements d.b
  {
    public a()
    {
      GMTrace.i(5045647048704L, 37593);
      GMTrace.o(5045647048704L, 37593);
    }
    
    public void aio()
    {
      GMTrace.i(5045781266432L, 37594);
      GMTrace.o(5045781266432L, 37594);
    }
    
    public void alg()
    {
      GMTrace.i(5045915484160L, 37595);
      GMTrace.o(5045915484160L, 37595);
    }
  }
  
  public static abstract interface b
  {
    public abstract void aio();
    
    public abstract void alg();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */