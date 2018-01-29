package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaConsignadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto contendo os detalhes de uma fatura consignada
 **/
@ApiModel(description = "Objeto contendo os detalhes de uma fatura consignada")
public class DetalhesFaturaConsignadaResponse  {
  
  @SerializedName("faturaConsignadaResponse")
  private FaturaConsignadaResponse faturaConsignadaResponse = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * Apresenta os detalhes da fatura
   **/
  @ApiModelProperty(value = "Apresenta os detalhes da fatura")
  public FaturaConsignadaResponse getFaturaConsignadaResponse() {
    return faturaConsignadaResponse;
  }
  public void setFaturaConsignadaResponse(FaturaConsignadaResponse faturaConsignadaResponse) {
    this.faturaConsignadaResponse = faturaConsignadaResponse;
  }

  
  /**
   * Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.
   **/
  @ApiModelProperty(value = "Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.")
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
