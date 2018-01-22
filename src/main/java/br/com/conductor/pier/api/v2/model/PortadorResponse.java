package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Portador
 **/
@ApiModel(description = "Portador")
public class PortadorResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private String dataCancelamentoPortador = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  @ApiModelProperty(value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o nome a ser impresso no cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o nome a ser impresso no cart\u00C3\u00A3o.")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do cart\u00C3\u00A3o (id), que ser\u00C3\u00A1 utilizado para gerar os cart\u00C3\u00B5es deste portador, vinculados a sua respectiva conta atrav\u00C3\u00A9s do campo idConta.
   **/
  @ApiModelProperty(value = "Apresenta o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do cart\u00C3\u00A3o (id), que ser\u00C3\u00A1 utilizado para gerar os cart\u00C3\u00B5es deste portador, vinculados a sua respectiva conta atrav\u00C3\u00A9s do campo idConta.")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
