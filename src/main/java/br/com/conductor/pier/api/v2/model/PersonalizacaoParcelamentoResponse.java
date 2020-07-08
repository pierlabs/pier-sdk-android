package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta que apresenta as informa\u00E7\u00F5es configuradas em um parcelamento personalizado
 **/
@ApiModel(description = "Objeto de resposta que apresenta as informa\u00E7\u00F5es configuradas em um parcelamento personalizado")
public class PersonalizacaoParcelamentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idRegraCampanha")
  private Long idRegraCampanha = null;
  @SerializedName("idRegraCampanhaRotativo")
  private Long idRegraCampanhaRotativo = null;
  @SerializedName("flagAntecipaContratosAbertos")
  private Boolean flagAntecipaContratosAbertos = null;
  @SerializedName("flagAntecipaParcRotativo")
  private Boolean flagAntecipaParcRotativo = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("idOperacaoRotativo")
  private Long idOperacaoRotativo = null;

  
  /**
   * Identificador da configura\u00E7\u00E3o de parcelamento personalizado
   **/
  @ApiModelProperty(value = "Identificador da configura\u00E7\u00E3o de parcelamento personalizado")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da campanha
   **/
  @ApiModelProperty(value = "Identificador da campanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * Identificador da campanha de rotativo
   **/
  @ApiModelProperty(value = "Identificador da campanha de rotativo")
  public Long getIdRegraCampanhaRotativo() {
    return idRegraCampanhaRotativo;
  }
  public void setIdRegraCampanhaRotativo(Long idRegraCampanhaRotativo) {
    this.idRegraCampanhaRotativo = idRegraCampanhaRotativo;
  }

  
  /**
   * Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de contratos abertos
   **/
  @ApiModelProperty(value = "Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de contratos abertos")
  public Boolean getFlagAntecipaContratosAbertos() {
    return flagAntecipaContratosAbertos;
  }
  public void setFlagAntecipaContratosAbertos(Boolean flagAntecipaContratosAbertos) {
    this.flagAntecipaContratosAbertos = flagAntecipaContratosAbertos;
  }

  
  /**
   * Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de parcelamento rotativo
   **/
  @ApiModelProperty(value = "Flag que identifica a ativa\u00E7\u00E3o da antecipa\u00E7\u00E3o de parcelamento rotativo")
  public Boolean getFlagAntecipaParcRotativo() {
    return flagAntecipaParcRotativo;
  }
  public void setFlagAntecipaParcRotativo(Boolean flagAntecipaParcRotativo) {
    this.flagAntecipaParcRotativo = flagAntecipaParcRotativo;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador da opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o de rotativo
   **/
  @ApiModelProperty(value = "Identificador da opera\u00E7\u00E3o de rotativo")
  public Long getIdOperacaoRotativo() {
    return idOperacaoRotativo;
  }
  public void setIdOperacaoRotativo(Long idOperacaoRotativo) {
    this.idOperacaoRotativo = idOperacaoRotativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalizacaoParcelamentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idRegraCampanha: ").append(idRegraCampanha).append("\n");
    sb.append("  idRegraCampanhaRotativo: ").append(idRegraCampanhaRotativo).append("\n");
    sb.append("  flagAntecipaContratosAbertos: ").append(flagAntecipaContratosAbertos).append("\n");
    sb.append("  flagAntecipaParcRotativo: ").append(flagAntecipaParcRotativo).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  idOperacaoRotativo: ").append(idOperacaoRotativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
