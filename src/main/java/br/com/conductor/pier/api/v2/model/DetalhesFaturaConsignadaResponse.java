package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaConsignadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object containing the details of a consignate invoice
 **/
@ApiModel(description = "Object containing the details of a consignate invoice")
public class DetalhesFaturaConsignadaResponse  {
  
  @SerializedName("faturaConsignadaResponse")
  private FaturaConsignadaResponse faturaConsignadaResponse = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * Show the details of the invoice
   **/
  @ApiModelProperty(value = "Show the details of the invoice")
  public FaturaConsignadaResponse getFaturaConsignadaResponse() {
    return faturaConsignadaResponse;
  }
  public void setFaturaConsignadaResponse(FaturaConsignadaResponse faturaConsignadaResponse) {
    this.faturaConsignadaResponse = faturaConsignadaResponse;
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
    sb.append("class DetalhesFaturaConsignadaResponse {\n");
    
    sb.append("  faturaConsignadaResponse: ").append(faturaConsignadaResponse).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
