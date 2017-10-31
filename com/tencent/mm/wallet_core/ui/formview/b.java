package com.tencent.mm.wallet_core.ui.formview;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.x.m;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.DecimalFormat;
import java.util.Calendar;

final class b
{
  public static int nZu;
  public static int nZv;
  public static final int xia;
  
  static
  {
    GMTrace.i(1499614674944L, 11173);
    nZu = 0;
    nZv = 0;
    xia = R.h.cIO;
    GMTrace.o(1499614674944L, 11173);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(1498809368576L, 11167);
    if (paramInt1 == -1)
    {
      GMTrace.o(1498809368576L, 11167);
      return;
    }
    paramMMActivity.a(com.tencent.mm.wallet_core.ui.b.a(paramMMActivity, paramInt1, paramMMActivity.getResources().getString(paramInt2), paramMMActivity.getResources().getString(R.l.eDF), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1484582289408L, 11061);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(1484582289408L, 11061);
      }
    }));
    GMTrace.o(1498809368576L, 11167);
  }
  
  static void a(TenpaySecureEditText paramTenpaySecureEditText, int paramInt)
  {
    GMTrace.i(1498540933120L, 11165);
    if (paramTenpaySecureEditText != null)
    {
      if (paramInt == 1)
      {
        paramTenpaySecureEditText.setIsPasswordFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 2)
      {
        paramTenpaySecureEditText.setIsSecurityAnswerFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 3)
      {
        paramTenpaySecureEditText.setIsCvvPaymentFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 4)
      {
        paramTenpaySecureEditText.setIsCvv4PaymentFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 5)
      {
        paramTenpaySecureEditText.setIsValidThru(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 6)
      {
        paramTenpaySecureEditText.setIsBankcardFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 7)
      {
        paramTenpaySecureEditText.setIsMoneyAmountFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      paramTenpaySecureEditText.setIsCvv4PaymentFormat(false);
      GMTrace.o(1498540933120L, 11165);
      return;
    }
    w.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
    GMTrace.o(1498540933120L, 11165);
  }
  
  public static void f(final MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1498675150848L, 11166);
    paramWalletFormView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1501493723136L, 11187);
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(System.currentTimeMillis());
        localCalendar.add(2, 1);
        b.nZu = localCalendar.get(1);
        b.nZv = localCalendar.get(2);
        DatePickerDialog localDatePickerDialog = (DatePickerDialog)this.xhO.getTag(b.xia);
        paramAnonymousView = localDatePickerDialog;
        if (localDatePickerDialog == null)
        {
          paramAnonymousView = new f(paramMMActivity, new DatePickerDialog.OnDateSetListener()
          {
            public final void onDateSet(DatePicker paramAnonymous2DatePicker, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
            {
              GMTrace.i(1496796102656L, 11152);
              if ((paramAnonymous2Int1 < b.nZu) && (paramAnonymous2Int2 < b.nZv))
              {
                h.b(b.1.this.lpL, b.1.this.lpL.getString(R.l.eUw), null, true);
                if (b.1.this.xhO.xid != null) {
                  b.1.this.xhO.xid.gQ(b.1.this.xhO.QR());
                }
                GMTrace.o(1496796102656L, 11152);
                return;
              }
              paramAnonymous2DatePicker = new DecimalFormat("00");
              if (m.zS()) {
                b.1.this.xhO.setTag(paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2Int1);
              }
              for (;;)
              {
                b.1.this.xhO.setText(paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2));
                break;
                b.1.this.xhO.setTag(paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2) + paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1));
              }
            }
          }, b.nZu, b.nZv, localCalendar.get(5), localCalendar.getTimeInMillis(), 2);
          this.xhO.setTag(b.xia, paramAnonymousView);
          paramMMActivity.a(paramAnonymousView);
        }
        paramAnonymousView.show();
        GMTrace.o(1501493723136L, 11187);
      }
    });
    GMTrace.o(1498675150848L, 11166);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */