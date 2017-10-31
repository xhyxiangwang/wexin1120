package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class SnsUploadSayFooter
  extends BasePanelKeybordLayout
{
  private MMActivity fsU;
  ImageButton nEi;
  ChatFooterPanel nEl;
  private boolean nEo;
  MMEditText qOh;
  
  public SnsUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8621744193536L, 64237);
    this.qOh = null;
    this.nEo = true;
    this.fsU = ((MMActivity)paramContext);
    this.nEi = ((ImageButton)((ViewGroup)v.fa(this.fsU).inflate(i.g.pPL, this)).findViewById(i.f.bhw));
    this.nEi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8738379399168L, 65106);
        SnsUploadSayFooter.b(SnsUploadSayFooter.this);
        GMTrace.o(8738379399168L, 65106);
      }
    });
    if (e.tgc == null)
    {
      this.nEl = new d(this.fsU);
      GMTrace.o(8621744193536L, 64237);
      return;
    }
    this.nEl = e.tgc.ci(getContext());
    this.nEl.cU(ChatFooterPanel.SCENE_SNS);
    this.nEl.setVisibility(8);
    paramContext = (LinearLayout)findViewById(i.f.cse);
    paramContext.setOnClickListener(null);
    paramContext.addView(this.nEl, -1, 0);
    this.nEl.oN();
    this.nEl.ar(false);
    this.nEl.sYp = new ChatFooterPanel.a()
    {
      public final void aLS()
      {
        GMTrace.i(8538663419904L, 63618);
        GMTrace.o(8538663419904L, 63618);
      }
      
      public final void acx()
      {
        GMTrace.i(8538931855360L, 63620);
        SnsUploadSayFooter.c(SnsUploadSayFooter.this).wTn.sendKeyEvent(new KeyEvent(0, 67));
        SnsUploadSayFooter.c(SnsUploadSayFooter.this).wTn.sendKeyEvent(new KeyEvent(1, 67));
        GMTrace.o(8538931855360L, 63620);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(8539066073088L, 63621);
        try
        {
          SnsUploadSayFooter.c(SnsUploadSayFooter.this).Wn(paramAnonymousString);
          GMTrace.o(8539066073088L, 63621);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.printErrStackTrace("MicroMsg.SnsUploadSayFooter", paramAnonymousString, "", new Object[0]);
          GMTrace.o(8539066073088L, 63621);
        }
      }
      
      public final void fR(boolean paramAnonymousBoolean)
      {
        GMTrace.i(8538797637632L, 63619);
        GMTrace.o(8538797637632L, 63619);
      }
    };
    GMTrace.o(8621744193536L, 64237);
  }
  
  private void abV()
  {
    GMTrace.i(8622146846720L, 64240);
    this.nEl.onPause();
    this.nEl.setVisibility(8);
    GMTrace.o(8622146846720L, 64240);
  }
  
  protected final List<View> aLR()
  {
    GMTrace.i(16631992418304L, 123918);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.nEl);
    GMTrace.o(16631992418304L, 123918);
    return localArrayList;
  }
  
  public final boolean bnT()
  {
    GMTrace.i(8621878411264L, 64238);
    if (this.nEl.getVisibility() == 0)
    {
      GMTrace.o(8621878411264L, 64238);
      return true;
    }
    GMTrace.o(8621878411264L, 64238);
    return false;
  }
  
  public final void bnU()
  {
    GMTrace.i(8622012628992L, 64239);
    abV();
    setVisibility(8);
    GMTrace.o(8622012628992L, 64239);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadSayFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */