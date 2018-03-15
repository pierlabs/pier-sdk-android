package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de resposta de risco de fraude
 **/
@ApiModel(description = "Par\u00E2metros de resposta de risco de fraude")
public class RiscoFraudeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoResolucao")
  private Long idTipoResolucao = null;
  @SerializedName("descricaoTipoResolucao")
  private String descricaoTipoResolucao = null;
  @SerializedName("flagAltoRisco")
  private Boolean flagAltoRisco = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * Quando ativa, indica que a transa\u00E7\u00E3o possui um alto risco de fraude e que todas as transa\u00E7\u00F5es seguintes a ela ser\u00E3o negadas at\u00E9 que todas as transa\u00E7\u00F5es classificadas com risco de fraude sejam analisadas
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a transa\u00E7\u00E3o possui um alto risco de fraude e que todas as transa\u00E7\u00F5es seguintes a ela ser\u00E3o negadas at\u00E9 que todas as transa\u00E7\u00F5es classificadas com risco de fraude sejam analisadas")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transa\u00E7\u00E3o")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Data em que a transa\u00E7\u00E3o classificada com risco de fraude foi realizada
   **/
  @ApiModelProperty(value = "Data em que a transa\u00E7\u00E3o classificada com risco de fraude foi realizada")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o classificada com risco de fraude
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o classificada com risco de fraude")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o classificada com risco de fraude
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o classificada com risco de fraude")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
