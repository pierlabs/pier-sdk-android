package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o para alterar origem comercial
 **/
@ApiModel(description = "Par\u00C3\u00A2metros de requisi\u00C3\u00A7\u00C3\u00A3o para alterar origem comercial")
public class OrigemComercialUpdate  {
  
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

  
  /**
   * Nome da origem comercial
   **/
  @ApiModelProperty(value = "Nome da origem comercial")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da origem comercial
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o da origem comercial")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identificador do estabelecimento
   **/
  @ApiModelProperty(value = "Identificador do estabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identificador do tipo de origem comercial
   **/
  @ApiModelProperty(value = "Identificador do tipo de origem comercial")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Identificador do grupo de origem comercial
   **/
  @ApiModelProperty(value = "Identificador do grupo de origem comercial")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Indica o status da origem comercial
   **/
  @ApiModelProperty(value = "Indica o status da origem comercial")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Indica se permite pr\u00C3\u00A9 aprova\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Indica se permite pr\u00C3\u00A9 aprova\u00C3\u00A7\u00C3\u00A3o")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * Indica se permite aprova\u00C3\u00A7\u00C3\u00A3o imediata
   **/
  @ApiModelProperty(value = "Indica se permite aprova\u00C3\u00A7\u00C3\u00A3o imediata")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * Nome fantasia impresso no pl\u00C3\u00A1stico
   **/
  @ApiModelProperty(value = "Nome fantasia impresso no pl\u00C3\u00A1stico")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * Indica se permite cart\u00C3\u00A3o provis\u00C3\u00B3rio
   **/
  @ApiModelProperty(value = "Indica se permite cart\u00C3\u00A3o provis\u00C3\u00B3rio")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * Indica se permite cart\u00C3\u00A3o definitivo
   **/
  @ApiModelProperty(value = "Indica se permite cart\u00C3\u00A3o definitivo")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * Usu\u00C3\u00A1rio para autentica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Usu\u00C3\u00A1rio para autentica\u00C3\u00A7\u00C3\u00A3o")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha para autentica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Senha para autentica\u00C3\u00A7\u00C3\u00A3o")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Indica se \u00C3\u00A9 origem externa
   **/
  @ApiModelProperty(value = "Indica se \u00C3\u00A9 origem externa")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * Indica se h\u00C3\u00A1 modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Indica se h\u00C3\u00A1 modifica\u00C3\u00A7\u00C3\u00A3o")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * Indica se envia fatura
   **/
  @ApiModelProperty(value = "Indica se envia fatura")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * Indica se permite cr\u00C3\u00A9dito de faturamento
   **/
  @ApiModelProperty(value = "Indica se permite cr\u00C3\u00A9dito de faturamento")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * Indica se concede limite provis\u00C3\u00B3rio
   **/
  @ApiModelProperty(value = "Indica se concede limite provis\u00C3\u00B3rio")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * Indica se digitaliza documento
   **/
  @ApiModelProperty(value = "Indica se digitaliza documento")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * Indica se realiza embossing em loja
   **/
  @ApiModelProperty(value = "Indica se realiza embossing em loja")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * Indica se realiza consulta pr\u00C3\u00A9via
   **/
  @ApiModelProperty(value = "Indica se realiza consulta pr\u00C3\u00A9via")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * Tipo de pessoa
   **/
  @ApiModelProperty(value = "Tipo de pessoa")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialUpdate {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
