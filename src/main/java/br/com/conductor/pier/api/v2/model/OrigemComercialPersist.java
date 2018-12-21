package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters to register commercial origin
 **/
@ApiModel(description = "Request Parameters to register commercial origin")
public class OrigemComercialPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoOrigemComercial")
  private Long idTipoOrigemComercial = null;
  @SerializedName("idGrupoOrigemComercial")
  private Long idGrupoOrigemComercial = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("flagPreAprovado")
  private Boolean flagPreAprovado = null;
  @SerializedName("flagAprovacaoImediata")
  private Boolean flagAprovacaoImediata = null;
  @SerializedName("nomeFantasiaPlastico")
  private String nomeFantasiaPlastico = null;
  @SerializedName("flagCartaoProvisorio")
  private Boolean flagCartaoProvisorio = null;
  @SerializedName("flagCartaoDefinitivo")
  private Boolean flagCartaoDefinitivo = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("flagOrigemExterna")
  private Boolean flagOrigemExterna = null;
  @SerializedName("flagModificado")
  private Boolean flagModificado = null;
  @SerializedName("flagEnviaFaturaUsuario")
  private Boolean flagEnviaFaturaUsuario = null;
  @SerializedName("flagCreditoFaturamento")
  private Boolean flagCreditoFaturamento = null;
  @SerializedName("flagConcedeLimiteProvisorio")
  private Boolean flagConcedeLimiteProvisorio = null;
  @SerializedName("flagDigitalizarDoc")
  private Boolean flagDigitalizarDoc = null;
  @SerializedName("flagEmbossingLoja")
  private Boolean flagEmbossingLoja = null;
  @SerializedName("flagConsultaPrevia")
  private Boolean flagConsultaPrevia = null;
  public enum TipoPessoaEnum {
     PESSOA_FISICA,  PESSOA_JURIDICA, 
  };
  @SerializedName("tipoPessoa")
  private TipoPessoaEnum tipoPessoa = null;
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * Commercial origin name
   **/
  @ApiModelProperty(value = "Commercial origin name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Description of the commecial origin
   **/
  @ApiModelProperty(value = "Description of the commecial origin")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identifier of the Merchant
   **/
  @ApiModelProperty(value = "Identifier of the Merchant")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identifier of the commercial origin type
   **/
  @ApiModelProperty(value = "Identifier of the commercial origin type")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Group identifier of the commercial origin
   **/
  @ApiModelProperty(value = "Group identifier of the commercial origin")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Indicate the status of the commercial origin
   **/
  @ApiModelProperty(value = "Indicate the status of the commercial origin")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Indicate if it allows the pre approvement
   **/
  @ApiModelProperty(value = "Indicate if it allows the pre approvement")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * Indicate if it allows immediate approvement
   **/
  @ApiModelProperty(value = "Indicate if it allows immediate approvement")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * Fantasy name printed on the plastic
   **/
  @ApiModelProperty(value = "Fantasy name printed on the plastic")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * Indicate if it allows the provisory card
   **/
  @ApiModelProperty(value = "Indicate if it allows the provisory card")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * Indicate if it allows definitive card
   **/
  @ApiModelProperty(value = "Indicate if it allows definitive card")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * User for authentication
   **/
  @ApiModelProperty(value = "User for authentication")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Password for the authentication
   **/
  @ApiModelProperty(value = "Password for the authentication")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Indicate if it is external origin
   **/
  @ApiModelProperty(value = "Indicate if it is external origin")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * Indicate if there is update
   **/
  @ApiModelProperty(value = "Indicate if there is update")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * Indicate the invoice sending
   **/
  @ApiModelProperty(value = "Indicate the invoice sending")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * Indicate if it allows the billing credit
   **/
  @ApiModelProperty(value = "Indicate if it allows the billing credit")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * Indicate if it gives provisory limit
   **/
  @ApiModelProperty(value = "Indicate if it gives provisory limit")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * Indicate if digitize the document
   **/
  @ApiModelProperty(value = "Indicate if digitize the document")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * Indicate if it makes embossing in the store
   **/
  @ApiModelProperty(value = "Indicate if it makes embossing in the store")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * Indicate if it is possible to make prior retrieve
   **/
  @ApiModelProperty(value = "Indicate if it is possible to make prior retrieve")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * Person type
   **/
  @ApiModelProperty(value = "Person type")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * Identifier of the Product of commercial origin
   **/
  @ApiModelProperty(value = "Identifier of the Product of commercial origin")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoOrigemComercial: ").append(idTipoOrigemComercial).append("\n");
    sb.append("  idGrupoOrigemComercial: ").append(idGrupoOrigemComercial).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  flagPreAprovado: ").append(flagPreAprovado).append("\n");
    sb.append("  flagAprovacaoImediata: ").append(flagAprovacaoImediata).append("\n");
    sb.append("  nomeFantasiaPlastico: ").append(nomeFantasiaPlastico).append("\n");
    sb.append("  flagCartaoProvisorio: ").append(flagCartaoProvisorio).append("\n");
    sb.append("  flagCartaoDefinitivo: ").append(flagCartaoDefinitivo).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  flagOrigemExterna: ").append(flagOrigemExterna).append("\n");
    sb.append("  flagModificado: ").append(flagModificado).append("\n");
    sb.append("  flagEnviaFaturaUsuario: ").append(flagEnviaFaturaUsuario).append("\n");
    sb.append("  flagCreditoFaturamento: ").append(flagCreditoFaturamento).append("\n");
    sb.append("  flagConcedeLimiteProvisorio: ").append(flagConcedeLimiteProvisorio).append("\n");
    sb.append("  flagDigitalizarDoc: ").append(flagDigitalizarDoc).append("\n");
    sb.append("  flagEmbossingLoja: ").append(flagEmbossingLoja).append("\n");
    sb.append("  flagConsultaPrevia: ").append(flagConsultaPrevia).append("\n");
    sb.append("  tipoPessoa: ").append(tipoPessoa).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
