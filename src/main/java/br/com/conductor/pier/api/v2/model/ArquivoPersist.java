package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoDetalhesPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Arquivo para persist\u00EAncia de dados
 **/
@ApiModel(description = "Objeto Arquivo para persist\u00EAncia de dados")
public class ArquivoPersist  {
  
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  public enum TipoComunicacaoEnum {
     SOAP,  REST, 
  };
  @SerializedName("tipoComunicacao")
  private TipoComunicacaoEnum tipoComunicacao = null;
  @SerializedName("detalhes")
  private List<ArquivoDetalhesPersist> detalhes = null;

  
  /**
   * Tipo do arquivo
   **/
  @ApiModelProperty(value = "Tipo do arquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Conte\u00FAdo do arquivo convertido em Base 64
   **/
  @ApiModelProperty(required = true, value = "Conte\u00FAdo do arquivo convertido em Base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Nome do arquivo
   **/
  @ApiModelProperty(value = "Nome do arquivo")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Extens\u00E3o do Arquivo
   **/
  @ApiModelProperty(value = "Extens\u00E3o do Arquivo")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Tipo de comunica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Tipo de comunica\u00E7\u00E3o")
  public TipoComunicacaoEnum getTipoComunicacao() {
    return tipoComunicacao;
  }
  public void setTipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
  }

  
  /**
   * Detalhes contendo informa\u00E7\u00F5es adicionais, relacionadas ao arquivo
   **/
  @ApiModelProperty(required = true, value = "Detalhes contendo informa\u00E7\u00F5es adicionais, relacionadas ao arquivo")
  public List<ArquivoDetalhesPersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoPersist {\n");
    
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  arquivo: ").append(arquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  tipoComunicacao: ").append(tipoComunicacao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
