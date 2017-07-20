package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoDetalhesPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Arquivo para persist\u00C3\u00AAncia de dados.
 **/
@ApiModel(description = "Objeto Arquivo para persist\u00C3\u00AAncia de dados.")
public class ArquivoPersist  {
  
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
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
   * Conte\u00C3\u00BAdo do arquivo convertido em Base 64
   **/
  @ApiModelProperty(value = "Conte\u00C3\u00BAdo do arquivo convertido em Base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Nome do arquivo.
   **/
  @ApiModelProperty(value = "Nome do arquivo.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Formato/extens\u00C3\u00A3o do arquivo.
   **/
  @ApiModelProperty(value = "Formato/extens\u00C3\u00A3o do arquivo.")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Detalhes contendo informa\u00C3\u00A7\u00C3\u00B5es adicionais, relacionadas ao arquivo
   **/
  @ApiModelProperty(required = true, value = "Detalhes contendo informa\u00C3\u00A7\u00C3\u00B5es adicionais, relacionadas ao arquivo")
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
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


