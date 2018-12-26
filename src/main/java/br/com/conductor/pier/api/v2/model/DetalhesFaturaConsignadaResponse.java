package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaConsignadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{detalhes_fatura_consignada_response_description}}}
 **/
@ApiModel(description = "{{{detalhes_fatura_consignada_response_description}}}")
public class DetalhesFaturaConsignadaResponse  {
  
  @SerializedName("faturaConsignadaResponse")
  private FaturaConsignadaResponse faturaConsignadaResponse = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * {{{detalhes_fatura_consignada_response_fatura_consignada_response_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhes_fatura_consignada_response_fatura_consignada_response_value}}}")
  public FaturaConsignadaResponse getFaturaConsignadaResponse() {
    return faturaConsignadaResponse;
  }
  public void setFaturaConsignadaResponse(FaturaConsignadaResponse faturaConsignadaResponse) {
    this.faturaConsignadaResponse = faturaConsignadaResponse;
  }

  
  /**
   * {{{detalhes_fatura_consignada_response_transacoes_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhes_fatura_consignada_response_transacoes_value}}}")
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
