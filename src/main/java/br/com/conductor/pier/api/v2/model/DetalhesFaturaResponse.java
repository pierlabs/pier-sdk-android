package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaFechadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{detalhes_fatura_response_description}}}
 **/
@ApiModel(description = "{{{detalhes_fatura_response_description}}}")
public class DetalhesFaturaResponse  {
  
  @SerializedName("fatura")
  private FaturaFechadaResponse fatura = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * {{{detalhes_fatura_response_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhes_fatura_response_fatura_value}}}")
  public FaturaFechadaResponse getFatura() {
    return fatura;
  }
  public void setFatura(FaturaFechadaResponse fatura) {
    this.fatura = fatura;
  }

  
  /**
   * {{{detalhes_fatura_response_transacoes_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhes_fatura_response_transacoes_value}}}")
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
