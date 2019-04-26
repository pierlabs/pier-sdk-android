package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TipoTransacaoAjusteResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Tipo de ajuste
 **/
@ApiModel(description = "Tipo de ajuste")
public class TipoAjusteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagPagamentoLojista")
  private Boolean flagPagamentoLojista = null;
  @SerializedName("transacoes")
  private List<TipoTransacaoAjusteResponse> transacoes = null;

  
  /**
   * C\u00F3digo identificador do tipo de ajuste
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo de ajuste")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de ajuste
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de ajuste")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identifica se o pagamento foi efetuado em algum estabelecimento
   **/
  @ApiModelProperty(value = "Identifica se o pagamento foi efetuado em algum estabelecimento")
  public Boolean getFlagPagamentoLojista() {
    return flagPagamentoLojista;
  }
  public void setFlagPagamentoLojista(Boolean flagPagamentoLojista) {
    this.flagPagamentoLojista = flagPagamentoLojista;
  }

  
  /**
   * Transa\u00E7\u00F5es relacionadas ao tipo do ajuste
   **/
  @ApiModelProperty(value = "Transa\u00E7\u00F5es relacionadas ao tipo do ajuste")
  public List<TipoTransacaoAjusteResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAjusteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagPagamentoLojista: ").append(flagPagamentoLojista).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
