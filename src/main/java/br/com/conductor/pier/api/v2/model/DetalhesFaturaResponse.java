package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaFechadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Containing the details of an invoice
 **/
@ApiModel(description = "Object Containing the details of an invoice")
public class DetalhesFaturaResponse  {
  
  @SerializedName("fatura")
  private FaturaFechadaResponse fatura = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * Show the details of the invoice
   **/
  @ApiModelProperty(value = "Show the details of the invoice")
  public FaturaFechadaResponse getFatura() {
    return fatura;
  }
  public void setFatura(FaturaFechadaResponse fatura) {
    this.fatura = fatura;
  }

  
  /**
   * Show the transactions related to the invoice
   **/
  @ApiModelProperty(value = "Show the transactions related to the invoice")
  public List<TransacoesCorrentesResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TransacoesCorrentesResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesFaturaResponse {\n");
    
    sb.append("  fatura: ").append(fatura).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
